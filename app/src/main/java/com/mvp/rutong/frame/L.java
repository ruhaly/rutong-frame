package com.mvp.rutong.frame;

import android.os.Environment;
import android.text.TextUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class L {

    private static boolean fileDebug = true;

    /**
     * 写入手机中便于查看
     *
     * @param time
     * @param msg
     * @param tag
     */
    public static void logToFile(String time, Object msg, String tag) {
        if (null == msg) {
            return;
        }
        if (fileDebug) {
            writeToSDCard(tag, "[" + time + "]" + "----->" + msg.toString()
                    + "\n");
        }
    }


    public static void i(String tag, Object msg) {
        if (fileDebug) {
            if (!TextUtils.isEmpty(tag) && null != msg) {
                android.util.Log.i("egj-" + tag, msg.toString());
            }
        }
    }

    public static void d(String tag, Object msg) {
        if (fileDebug) {
            if (!TextUtils.isEmpty(tag) && null != msg) {
                android.util.Log.d("egj-" + tag, msg.toString());
            }
        }
    }

    public static void e(String tag, Object msg) {
        if (fileDebug) {
            if (!TextUtils.isEmpty(tag) && null != msg) {
                android.util.Log.e("egj-" + tag, msg.toString());
            }
        }
    }


    private static void writeToSDCard(String fileName, String text) {

        if (Environment.getExternalStorageState()
                .equals(Environment.MEDIA_MOUNTED)) {
            FileOutputStream fileOutputStream = null;
            FileInputStream fileInputStream = null;
            try {
                File file = new File(Environment.getExternalStorageDirectory(),
                        fileName);

                fileOutputStream = new FileOutputStream(file, true);
                fileOutputStream.write(text.getBytes());
            } catch (Exception e) {

            } finally {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}