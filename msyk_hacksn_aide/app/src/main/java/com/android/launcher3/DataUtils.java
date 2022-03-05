package com.android.launcher3;

import android.content.Context;
import android.content.SharedPreferences;

public class DataUtils {
    public DataUtils() {
    }

    public static void saveStringValue(Context context, String tag, String Value) {
        SharedPreferences.Editor editor = context.getApplicationContext().getSharedPreferences("data", 0).edit();
        editor.putString(tag, Value);
        editor.apply();
    }

    public static String ReadStringValue(Context context, String tag, String Value) {
        return context.getApplicationContext().getSharedPreferences("data", 0).getString(tag, Value);
    }
}

