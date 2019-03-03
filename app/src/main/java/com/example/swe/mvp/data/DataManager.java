package com.example.swe.mvp.data;

import com.example.swe.mvp.data.network.NetworkHelper;
import com.example.swe.mvp.data.network.api.APIInterceptor;
import com.example.swe.mvp.data.prefs.PreferencesHelper;

public interface DataManager{
    NetworkHelper getAPIService();

    PreferencesHelper getPreferenceContainer();
}
