package com.mvp.rutong.frame.base.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class JsonUtil {

    static Gson gson = new Gson();

    private JsonUtil() {
    }


    /**
     * 转成json
     *
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        String gsonString = null;
        if (gson != null) {
            gsonString = gson.toJson(object);
        }
        return gsonString;
    }


    /**
     * 转成bean
     *
     * @param gsonString
     * @param cls
     * @return
     */
    public static <T> T toBean(String gsonString, Class<T> cls) {
        T t = null;
        if (gson != null) {
            t = gson.fromJson(gsonString, cls);
        }
        return t;
    }


    /**
     * 转成list
     *
     * @param gsonString
     * @param type
     * @return
     */
    public static <T> List<T> toList(String gsonString, TypeToken<List<T>> type) {
        List<T> list = null;
        gson.fromJson(gsonString, type.getType());
        if (gson != null) {
            list = gson.fromJson(gsonString, type.getType());
        }
        return list;
    }

    /**
     * 转成list
     *
     * @param gsonString
     * @param type
     * @return
     */
    public static <T> LinkedHashSet<T> toLinkedHashSet(String gsonString, TypeToken<LinkedHashSet<T>> type) {
        LinkedHashSet<T> list = null;
        gson.fromJson(gsonString, type.getType());
        if (gson != null) {
            list = gson.fromJson(gsonString, type.getType());
        }
        return list;
    }

    /**
     * 转成list中有map的
     *
     * @param gsonString
     * @return
     */
    public static <T> List<Map<String, T>> GsonToListMaps(String gsonString) {
        List<Map<String, T>> list = null;
        if (gson != null) {
            list = gson.fromJson(gsonString,
                    new TypeToken<List<Map<String, T>>>() {
                    }.getType());
        }
        return list;
    }


    /**
     * 转成map的
     *
     * @param gsonString
     * @return
     */
    public static <T> Map<String, T> GsonToMaps(String gsonString) {
        Map<String, T> map = null;
        if (gson != null) {
            map = gson.fromJson(gsonString, new TypeToken<Map<String, T>>() {
            }.getType());
        }
        return map;
    }

    public static int getInt(String key, String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.optInt(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String getString(String key, String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.optString(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return "";
    }


    public static boolean getBoolean(String key, String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return jsonObject.optBoolean(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
}
