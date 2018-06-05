package com.lizixc.mikuweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

public class MyApplication extends Application {
    private static Context context;

    public MyApplication() {
        this.context = getApplicationContext();
        LitePal.initialize(context);
    }
    public static final Context getContext(){
        return context;
    }
}
