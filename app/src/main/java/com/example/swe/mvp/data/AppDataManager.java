package com.example.swe.mvp.data;

import android.content.Context;

import com.example.swe.mvp.data.prefs.PreferencesHelper;
import com.example.swe.mvp.di.AppContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager{
    private static final String TAG = AppDataManager.class.getSimpleName();
    private PreferencesHelper preferencesHelper;

    @Inject
    public AppDataManager(@AppContext Context context,
                          PreferencesHelper preferencesHelper){
        this.preferencesHelper = preferencesHelper;
    }
}
