package com.example.swe.mvp.di.module;

import android.app.Application;
import android.content.Context;

import com.example.swe.mvp.data.AppDataManager;
import com.example.swe.mvp.data.DataManager;
import com.example.swe.mvp.data.network.NetworkHelper;
import com.example.swe.mvp.data.network.NetworkProvider;
import com.example.swe.mvp.data.network.api.APIHeader;
import com.example.swe.mvp.data.network.api.APIInterceptor;
import com.example.swe.mvp.data.network.api.APIService;
import com.example.swe.mvp.data.prefs.AppPreference;
import com.example.swe.mvp.data.prefs.PreferencesHelper;
import com.example.swe.mvp.di.AppContext;
import com.example.swe.mvp.di.PreferenceInfo;

import java.lang.reflect.Parameter;

import javax.inject.Singleton;

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

    @Provides
    @PreferenceInfo
    String providePreferenceName(){
        return mApplication.getPackageName();
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager){
        return appDataManager;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferenceHelper(AppPreference appPreference){
        return appPreference;
    }

    @Provides
    @Singleton
    NetworkHelper provideNetworkHelper(NetworkProvider networkProvider){
        return networkProvider;
    }

    @Provides
    @Singleton
    APIService provideApiCall(APIInterceptor apiInterceptor) {
        return APIService.Factory.create();
    }

    @Provides
    @Singleton
    APIHeader provideApiHeader() {
        return new APIHeader(mApplication.getApplicationContext());
    }
}
