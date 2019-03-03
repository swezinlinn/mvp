package com.example.swe.mvp.data.network.api;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author swezinlinn
 */

@Singleton
public class APIInterceptor {
    private APIHeader apiHeader;

    @Inject
    public APIInterceptor(final APIHeader header){
        apiHeader = header;
    }
}
