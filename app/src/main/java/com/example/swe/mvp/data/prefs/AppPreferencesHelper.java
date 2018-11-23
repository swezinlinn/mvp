package com.example.swe.mvp.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.swe.mvp.di.AppContext;
import com.example.swe.mvp.di.PreferenceInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppPreferencesHelper implements PreferencesHelper{
    private static final String PREF_USER = "pref_user";
    private final SharedPreferences mPrefs;

    @Inject
    public AppPreferencesHelper(@AppContext Context context,
                                @PreferenceInfo String prefFileName){
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

}
