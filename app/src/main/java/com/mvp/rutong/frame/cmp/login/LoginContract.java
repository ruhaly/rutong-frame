package com.mvp.rutong.frame.cmp.login;


import com.mvp.rutong.frame.C;
import com.mvp.rutong.frame.base.BaseModel;
import com.mvp.rutong.frame.base.BasePresenter;
import com.mvp.rutong.frame.base.BaseView;
import com.mvp.rutong.frame.data.entity.User;

import rx.Observable;

/**
 * Created by han_l on 2016/5/31.
 */
public interface LoginContract {
    interface Model extends BaseModel {
        Observable<User> login(String name, String pass);
    }

    interface View extends BaseView {
        void loginSuccess();

        void showMsg(String msg);
    }

//    abstract class Presenter extends BasePresenter<Model, View> {
//        public abstract void login(String name, String pass);
//
//        @Override
//        public void onStart() {
//            mRxManage.on(C.EVENT_LOGIN, o -> mView.showMsg(o.toString()));
//            mRxManage.on(C.EVENT_LOGIN_INVALID, o -> mView.showMsg(o.toString()));
//
//        }
//    }
}
