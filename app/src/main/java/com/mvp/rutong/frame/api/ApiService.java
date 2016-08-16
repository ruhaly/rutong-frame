package com.mvp.rutong.frame.api;


import com.mvp.rutong.frame.data.entity.User;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by han_l on 2016/5/30.
 */
public interface ApiService {

    @FormUrlEncoded
    @POST("account/login")
    Observable<User> login(@Field("loginName") String username, @Field("password") String password);
}
