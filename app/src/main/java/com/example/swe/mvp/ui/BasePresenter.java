package com.example.swe.mvp.ui;

import com.example.swe.mvp.data.DataManager;

public class BasePresenter<V extends ViewInterface> implements PresenterInterface {
    private DataManager dataManager;
    private V baseView;
}
