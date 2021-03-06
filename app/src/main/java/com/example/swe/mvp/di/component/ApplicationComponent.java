package com.example.swe.mvp.di.component;

import android.app.Application;
import android.content.Context;

import com.example.swe.mvp.MvpApp;
import com.example.swe.mvp.connectivity.NetworkUtilityInterface;
import com.example.swe.mvp.data.DataManager;
import com.example.swe.mvp.di.AppContext;
import com.example.swe.mvp.di.module.ActivityModule;
import com.example.swe.mvp.di.module.ApplicationModule;
import com.example.swe.mvp.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, NetworkModule.class})
public interface ApplicationComponent {

    void inject(MvpApp mvpApp);

    @AppContext
    Context context();

    Application application();

    DataManager getDataManager();

    NetworkUtilityInterface getNetworkUtility();
}
