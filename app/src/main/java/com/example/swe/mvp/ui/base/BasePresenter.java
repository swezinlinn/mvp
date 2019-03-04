package com.example.swe.mvp.ui.base;

import android.preference.Preference;

import com.example.swe.mvp.connectivity.NetworkUtilityInterface;
import com.example.swe.mvp.data.DataManager;
import com.example.swe.mvp.data.network.api.APIService;
import com.example.swe.mvp.data.prefs.AppPreference;
import com.example.swe.mvp.data.prefs.PreferencesHelper;

import javax.inject.Inject;

public class BasePresenter<V extends ViewInterface> implements PresenterInterface<V> {
    private static final String TAG = BasePresenter.class.getSimpleName();

    private DataManager dataManager;
    private NetworkUtilityInterface networkUtility;
    private V baseView;

    @Inject
    public BasePresenter(DataManager dataManager, NetworkUtilityInterface networkUtility){
        this.dataManager = dataManager;
        this.networkUtility = networkUtility;
    }

    @Override
    public void onAttach(V baseView) {
        this.baseView = baseView;
    }


    public DataManager getDataManager() {
        return dataManager;
    }

    public NetworkUtilityInterface getNetworkUtility() {
        return networkUtility;
    }

    @Override
    public APIService getAPIService() {
        return dataManager.getAPIService().service();
    }

    @Override
    public PreferencesHelper getPreference() {
        return dataManager.getPreferenceContainer();
    }

    public V getBaseView() {
        return baseView;
    }
}
