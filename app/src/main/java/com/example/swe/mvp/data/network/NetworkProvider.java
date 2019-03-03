package com.example.swe.mvp.data.network;

import com.example.swe.mvp.data.network.api.APIHeader;
import com.example.swe.mvp.data.network.api.APIService;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author swezinlinn
 */
@Singleton
public class NetworkProvider implements  NetworkHelper{
    private APIHeader apiHeader;
    private APIService apiService;

    @Inject
    public NetworkProvider(APIHeader apiHeader, APIService apiService){
        this.apiHeader = apiHeader;
        this.apiService = apiService;
    }

    @Override
    public APIService service() {
        return apiService;
    }
}
