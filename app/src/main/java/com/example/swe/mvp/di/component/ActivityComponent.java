package com.example.swe.mvp.di.component;

import com.example.swe.mvp.di.PerActivity;
import com.example.swe.mvp.di.module.ActivityModule;
import com.example.swe.mvp.ui.welcome.WelcomeActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {
    void inject(WelcomeActivity welcomeActivity);
}
