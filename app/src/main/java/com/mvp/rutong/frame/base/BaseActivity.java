package com.mvp.rutong.frame.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.mvp.rutong.frame.R;
import com.mvp.rutong.frame.base.util.SpUtil;
import com.mvp.rutong.frame.base.util.TUtil;
import com.mvp.rutong.frame.view.SwipeBackLayout;

import butterknife.ButterKnife;

/**
 * Created by han_l on 2016/5/31.
 */
public abstract class BaseActivity<P extends BasePresenter, M extends BaseModel> extends AppCompatActivity {
    public boolean isNight;
    public P mPresenter;
    public M mModel;
    public Context mContext;

    private SwipeBackLayout swipeBackLayout;
    private ImageView ivShadow;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        isNight = SpUtil.isNight();
        setTheme(isNight ? R.style.AppThemeNight : R.style.AppThemeDay);
        this.setContentView(this.getLayoutId());
        ButterKnife.bind(this);
        mContext = this;
        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);
        this.initView();
        this.initPresenter();
    }


    @Override
    public void setContentView(int layoutResID) {
        if (layoutResID == R.layout.activity_main) {
            super.setContentView(layoutResID);
        } else {
            super.setContentView(getContainer());
            View view = LayoutInflater.from(this).inflate(layoutResID, null);
            view.setBackgroundColor(getResources().getColor(R.color.window_background));
            swipeBackLayout.addView(view);
        }
    }

    private View getContainer() {
        RelativeLayout container = new RelativeLayout(this);
        swipeBackLayout = new SwipeBackLayout(this);
        swipeBackLayout.setDragEdge(SwipeBackLayout.DragEdge.LEFT);
        ivShadow = new ImageView(this);
        ivShadow.setBackgroundColor(getResources().getColor(R.color.theme_black_7f));
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        container.addView(ivShadow, params);
        container.addView(swipeBackLayout);
        swipeBackLayout.setOnSwipeBackListener((fa, fs) -> ivShadow.setAlpha(1 - fs));
        return container;
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (isNight != SpUtil.isNight()) {
            reload();
        }
    }

    public void reload() {
        Intent intent = getIntent();
        overridePendingTransition(0, 0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        overridePendingTransition(0, 0);
        startActivity(intent);
    }

    public abstract int getLayoutId();

    public abstract void initView();

    /**
     * 简单页面无需mvp就不用管此方法即可,完美兼容各种实际场景的变通
     */
    public abstract void initPresenter();
}
