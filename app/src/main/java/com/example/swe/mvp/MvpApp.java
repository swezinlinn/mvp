package com.example.swe.mvp;

import android.app.Application;

import com.example.swe.mvp.data.DataManager;
import com.example.swe.mvp.di.AppContext;

import javax.inject.Inject;

public class MvpApp extends Application {

    private AppContext appContext;

    @Inject
    DataManager mDataManager;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
