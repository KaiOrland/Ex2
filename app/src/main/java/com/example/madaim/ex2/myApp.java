package com.example.madaim.ex2;

import android.app.Application;
import android.util.Log;

/**
 * Created by Madaim on 23/09/2016.
 */
public class myApp extends Application{
    public final static String MYTAG = "myApp";
    @Override
    public void onCreate() {
        Log.i(MYTAG, "App:onCreate event");
        super.onCreate();

    }

    @Override
    public void onTerminate() {
        Log.i(MYTAG, "App:onTerminate event");
        super.onTerminate();
    }
}
