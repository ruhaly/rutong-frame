package com.mvp.rutong.frame;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.mvp.rutong.frame.base.util.SpUtil;


/**
 * Created by han_l on 2016/5/31.
 */
public class App extends Application {
    private static App mApp;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this;
        SpUtil.init(this);
    }

    public static Context getAppContext() {
        return mApp;
    }

    public static Resources getAppResources() {
        return mApp.getResources();
    }

}
