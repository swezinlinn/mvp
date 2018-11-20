package com.example.swe.mvp.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.swe.mvp.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity){
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return mActivity;
    }
}
