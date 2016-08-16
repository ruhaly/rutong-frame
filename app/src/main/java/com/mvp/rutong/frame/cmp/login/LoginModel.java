package com.mvp.rutong.frame.cmp.login;


import com.mvp.rutong.frame.api.Api;
import com.mvp.rutong.frame.base.helper.RxSchedulers;
import com.mvp.rutong.frame.data.entity.User;

import rx.Observable;

/**
 * Created by han_l on 2016/5/31.
 */
public class LoginModel implements LoginContract.Model {
    @Override
    public Observable<User> login(String name, String pass) {
        return Api.getInstance().apiService.login(name, pass).compose(RxSchedulers.io_main());
    }
}
