package com.example.swe.mvp.data;

import com.example.swe.mvp.data.prefs.PreferencesHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager{
    private static final String TAG = AppDataManager.class.getSimpleName();
    private PreferencesHelper preferencesHelper;

    @Inject
    public AppDataManager(PreferencesHelper preferencesHelper){


        this.preferencesHelper = preferencesHelper;
    }
}
