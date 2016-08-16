package com.mvp.rutong.frame.base;

/**
 * Created by hlr on 2015/9/21.
 */
public class CustomThrowable extends Throwable {

    private int code;

    public CustomThrowable(String detailMessage) {
        super(detailMessage);
    }

    public CustomThrowable(int code) {
        this.code = code;
    }

    public CustomThrowable(int code, String detailMessage) {
        super(detailMessage);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
