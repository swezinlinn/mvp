package com.example.swe.mvp.data;

import android.content.Context;

import com.example.swe.mvp.data.network.NetworkHelper;
import com.example.swe.mvp.data.prefs.PreferencesHelper;
import com.example.swe.mvp.di.AppContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager{
    private static final String TAG = AppDataManager.class.getSimpleName();
    private NetworkHelper networkHelper;
    private PreferencesHelper preferencesHelper;

    @Inject
    public AppDataManager(NetworkHelper networkHelper,
                          PreferencesHelper preferencesHelper){
        this.networkHelper = networkHelper;
        this.preferencesHelper = preferencesHelper;
    }

    @Override
    public NetworkHelper getAPIService() {
        return networkHelper;
    }

    @Override
    public PreferencesHelper getPreferenceContainer() {
        return preferencesHelper;
    }
}
