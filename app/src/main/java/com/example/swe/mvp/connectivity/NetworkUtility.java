package com.example.swe.mvp.connectivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

import javax.inject.Inject;

/**
 * @author swezinlinn
 */
public class NetworkUtility implements NetworkUtilityInterface {
    private ConnectivityManager connectivityManager;
    private WifiManager wifiManager;

    @Inject
    public NetworkUtility(ConnectivityManager connectivityManager, WifiManager wifiManager){
        this.connectivityManager = connectivityManager;
        this.wifiManager = wifiManager;
    }

    @Override
    public Boolean hasActiveNetwork() {
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }

    @Override
    public int getCurrentConnectedNetworkType() {
        try {
            return connectivityManager.getActiveNetworkInfo().getType();
        } catch (NullPointerException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public String getConnectedWifiSSID() {
        WifiInfo wifiInfo = (WifiInfo) wifiManager.getConnectionInfo();
        try {
            return formatSSID(wifiInfo.getSSID());
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String formatSSID(String raw) { return raw.replace("\"", ""); }
}
