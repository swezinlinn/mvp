package com.example.swe.mvp.ui.base;

import android.preference.Preference;

import com.example.swe.mvp.data.network.api.APIService;
import com.example.swe.mvp.data.prefs.PreferencesHelper;

public interface PresenterInterface<V extends ViewInterface> {
    void onAttach(V baseView);

    APIService getAPIService();

    PreferencesHelper getPreference();
}
