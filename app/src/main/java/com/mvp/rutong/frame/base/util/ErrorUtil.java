package com.mvp.rutong.frame.base.util;

import android.content.Context;
import android.text.TextUtils;

import com.mvp.rutong.frame.App;
import com.mvp.rutong.frame.C;
import com.mvp.rutong.frame.base.CustomThrowable;
import com.mvp.rutong.frame.base.RxManage;


/**
 * Created by han_l on 2016/5/31.
 */
public class ErrorUtil {
    private static Context context = App.getAppContext();


    /**
     * 处理异常
     *
     * @param throwable
     */
    public void handleError(Throwable throwable) {

        if (throwable instanceof CustomThrowable) {
            int code = ((CustomThrowable) throwable).getCode();
            switch (code) {
                case C.CODE_SERVER_ERROR: {
                    ToastUtil.show("服务器异常");
                    break;
                }
                case C.CODE_NET_ERROR: {
                    ToastUtil.show("网络异常");
                    break;
                }
                default: {
                    String message = throwable.getMessage();
                    if (!TextUtils.isEmpty(message)) {
                        ToastUtil.show(message);
                        if (code == C.CODE_LOGIN_INVALID) {
                            new RxManage().post(C.CODE_LOGIN_INVALID, "");
                        }
                    } else {
                        ToastUtil.show("网络异常");
                    }
                    break;
                }
            }
        } else {
            ToastUtil.show("数据异常");
        }


    }
}
