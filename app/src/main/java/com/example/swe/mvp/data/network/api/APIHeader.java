package com.example.swe.mvp.data.network.api;

import android.content.Context;

/**
 * @author swezinlinn
 */
public class APIHeader {
    private Context context;
    public APIHeader(Context context) {
        this.context = context;
    }
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
