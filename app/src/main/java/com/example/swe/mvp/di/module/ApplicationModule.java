package com.example.swe.mvp.di.module;

import android.app.Application;
import android.content.Context;

import com.example.swe.mvp.di.AppContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

    @Provides
    @AppContext
    Context provideContext(){
        return mApplication;
    }
}
