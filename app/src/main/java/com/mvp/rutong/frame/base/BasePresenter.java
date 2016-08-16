package com.mvp.rutong.frame.base;

import android.content.Context;

/**
 * Created by han_l on 2016/5/31.
 */
public abstract class BasePresenter<M, V> {
    public Context context;

    public M mModel;

    public V mView;

    public RxManage mRxManage = new RxManage();

    public void setVM(V v, M m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }

    public abstract void onStart();

    public void onDestroy() {
        mRxManage.clear();
    }
}
