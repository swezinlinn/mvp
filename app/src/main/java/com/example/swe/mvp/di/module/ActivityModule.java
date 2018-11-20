package com.example.swe.mvp.di.module;

import android.support.v7.app.AppCompatActivity;

import dagger.Provides;

public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity){
        this.mActivity = activity;
    }


}
