package com.example.swe.mvp.di.module;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;

import com.example.swe.mvp.di.ActivityContext;
import com.example.swe.mvp.di.PerActivity;
import com.example.swe.mvp.ui.welcome.WelcomePresenter;
import com.example.swe.mvp.ui.welcome.WelcomePresenterInterface;
import com.example.swe.mvp.ui.welcome.WelcomeView;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity){
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return mActivity;
    }

    @Provides
    @PerActivity
    WelcomePresenterInterface<WelcomeView> provideWelcomePresenter(WelcomePresenter<WelcomeView> presenter) {
        return presenter;
    }
}
