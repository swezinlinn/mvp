package com.example.swe.mvp.ui.welcome;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.swe.mvp.R;
import com.example.swe.mvp.ui.base.BaseActivity;

import javax.inject.Inject;

public class WelcomeActivity extends BaseActivity implements WelcomeView {

    @Inject
    WelcomePresenter<WelcomeView> presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

}
