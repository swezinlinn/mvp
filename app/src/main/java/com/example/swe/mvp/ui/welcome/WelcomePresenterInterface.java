package com.example.swe.mvp.ui.welcome;

import com.example.swe.mvp.di.PerActivity;
import com.example.swe.mvp.ui.base.PresenterInterface;

/**
 * @author swezinlinn
 */
@PerActivity
public interface WelcomePresenterInterface <V extends WelcomeView> extends PresenterInterface<V> {
}
