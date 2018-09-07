package com.dendev.millionaire.room;

import android.app.Application;

import org.jetbrains.annotations.NotNull;

public class AppContext extends Application {


    @NotNull
    private static AppContext instance;

    public AppContext() {
        instance = this;
    }

    @NotNull
    public static AppContext getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}