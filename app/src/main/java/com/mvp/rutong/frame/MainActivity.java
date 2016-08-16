package com.mvp.rutong.frame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.mvp.rutong.frame.base.BaseActivity;
import com.mvp.rutong.frame.ui.login.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_login)
    public Button btnLogin;


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        btnLogin.setOnClickListener(v -> startActivity(new Intent(this, LoginActivity.class)));
    }

    @Override
    public void initPresenter() {

    }
}
