package com.mvp.rutong.frame.cmp.login;


import com.mvp.rutong.frame.C;
import com.mvp.rutong.frame.base.BasePresenter;
import com.mvp.rutong.frame.base.util.MD5Util;

/**
 * Created by han_l on 2016/5/31.
 */
public class LoginPresenter extends BasePresenter<LoginContract.Model, LoginContract.View>{
    public void login(String name, String pass) {
        mRxManage.add(mModel.login(name, MD5Util.encode(pass).toUpperCase()).subscribe(user -> {
            mView.loginSuccess();
            mView.showMsg("登录成功");
            mRxManage.post(C.EVENT_LOGIN, user.getUserNickName());
        }, throwable -> mView.showMsg("登录失败")));
    }

    @Override
    public void onStart() {

    }
}
