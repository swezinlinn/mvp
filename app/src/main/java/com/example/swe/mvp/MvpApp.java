package com.example.swe.mvp;

import android.app.Application;

import com.example.swe.mvp.data.DataManager;
import com.example.swe.mvp.di.component.ApplicationComponent;
import com.example.swe.mvp.di.component.DaggerApplicationComponent;
import com.example.swe.mvp.di.module.ApplicationModule;

import javax.inject.Inject;

public class MvpApp extends Application {

    private ApplicationComponent applicationComponent;

    @Inject
    DataManager mDataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        applicationComponent.inject(this);
    }

   public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
