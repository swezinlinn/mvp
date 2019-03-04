package com.example.swe.mvp.ui.welcome;

import android.os.Bundle;

import com.example.swe.mvp.R;
import com.example.swe.mvp.ui.base.BaseActivity;
import com.example.swe.mvp.ui.base.ViewInterface;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * @author swezinlinn
 */
public class WelcomeActivity extends BaseActivity implements WelcomeView {
    @Inject
    WelcomePresenterInterface<WelcomeView> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        presenter.onAttach(WelcomeActivity.this);
    }
    @Override
    protected void setUp() {

    }
}
