package com.fan.core.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

@SuppressWarnings("all")
public class JsonUtil {

    private JsonUtil() {

    }

    private volatile static Gson gson;

    private static Gson getGson() {
        if (null == gson) {
            synchronized (JsonUtil.class) {
                if (null == gson) {
                    gson = new GsonBuilder().disableHtmlEscaping().create();
                }
            }
        }
        return gson;
    }

    public static String toJson(Object obj) {
        return getGson().toJson(obj);
    }

    public static <T> T fromJson(String str, Class<T> clazz) {
        return getGson().fromJson(str, clazz);
    }

    public static <T> T fromJson(String str, Type typeOfT) {
        return getGson().fromJson(str, typeOfT);
    }

    public static Map<String, Object> toMap(String str) {
        return toMap(str, Object.class);
    }

    public static <T> Map<String, T> toMap(String str, Class<T> clazz) {
        Map<String, T> map = null;
        map = fromJson(str, new TypeToken<Map<String, T>>() {
            private static final long serialVersionUID = -4451910562096098198L;
        }.getType());
        return map;
    }


    public static <T> T toObject(String str, Class<T> clazz) {
        return getGson().fromJson(str, clazz);
    }
}
