package com.example.swe.mvp.connectivity;

/**
 * @author swezinlinn
 */
public interface NetworkUtilityInterface {
    Boolean hasActiveNetwork();

    int getCurrentConnectedNetworkType();

    String getConnectedWifiSSID();

    String formatSSID(String raw);
}
