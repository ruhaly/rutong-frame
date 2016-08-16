package com.mvp.rutong.frame.base.util;

import android.content.Context;

import com.bumptech.glide.load.Transformation;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Created by hlr on 2015/12/28.
 * glide图形库类
 */
public class GlideUtil {

    public static Transformation getCropCircleTransformation(Context context) {
        return new CropCircleTransformation(context);
    }
}
