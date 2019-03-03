package com.example.swe.mvp.di.module;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;

import com.example.swe.mvp.connectivity.NetworkUtility;
import com.example.swe.mvp.connectivity.NetworkUtilityInterface;
import com.example.swe.mvp.di.AppContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author swezinlinn
 */
@Module
public class NetworkModule {
    @AppContext
    private Context context;

    public NetworkModule(@AppContext Context context){
        this.context = context;
    }

    @Provides
    @Singleton
    WifiManager provideWifiManager(){
        return (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    }

    @Provides
    @Singleton
    ConnectivityManager provideConnectivityManager(){
        return (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }


    @Provides
    @Singleton
    NetworkUtilityInterface provideNetworkModule(NetworkUtility networkUtility){
        return networkUtility;
    }
}
