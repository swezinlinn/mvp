package com.example.swe.mvp.di.module;

import android.app.Dialog;
import android.content.Context;

import com.example.swe.mvp.di.ActivityContext;
import com.example.swe.mvp.ui.dialog.loading.LoadingDialog;
import com.example.swe.mvp.ui.dialog.loading.LoadingDialogInterface;

import dagger.Provides;

/**
 * @author swe
 * @since 26/December/2018
 */
public class AppDialogModule {
    private Context mContext;

    public AppDialogModule(@ActivityContext Context context){
        this.mContext = context;
    }

    @Provides
    Dialog provideDialog(Dialog dialog){
        return new Dialog(mContext);
    }

    @Provides
    LoadingDialogInterface  provideLoadingDialog(Dialog dialog){
        return new LoadingDialog(dialog);
    }
}
