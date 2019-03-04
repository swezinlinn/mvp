package com.example.swe.mvp.ui.welcome;

import com.example.swe.mvp.connectivity.NetworkUtilityInterface;
import com.example.swe.mvp.data.DataManager;
import com.example.swe.mvp.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * @author swezinlinn
 * @since 3/4/19
 */
public class WelcomePresenter  <V extends WelcomeView> extends BasePresenter<V> implements WelcomePresenterInterface<V> {

    @Inject
    public WelcomePresenter(DataManager dataManager, NetworkUtilityInterface networkUtility) {
        super(dataManager, networkUtility);
    }
}
