package com.mvp.rutong.frame.data.result;


import com.mvp.rutong.frame.data.entity.User;

/**
 * Created by han_l on 2016/5/31.
 */
public class LoginResult {

    User account;

    User user;

    public User getAccount() {
        return account;
    }

    public void setAccount(User account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
