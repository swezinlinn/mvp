package com.example.swe.mvp.ui.base;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.swe.mvp.MvpApp;
import com.example.swe.mvp.di.component.ActivityComponent;
import com.example.swe.mvp.di.component.DaggerActivityComponent;
import com.example.swe.mvp.di.module.ActivityModule;

import androidx.annotation.Nullable;
import butterknife.Unbinder;

/**
 * @author swezinlinn
 */
public abstract class BaseActivity extends AppCompatActivity implements ViewInterface, BaseFragment.Callback{
    private static final String TAG = BaseActivity.class.getSimpleName();

    private DialogInterface mDialog;

    private ActivityComponent activityComponent;
    private Unbinder unBinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((MvpApp) getApplication()).getAppComponent())
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    public void setUnBinder(Unbinder unBinder) {
        this.unBinder = unBinder;
    }

    @Override
    public void onFragmentAttached() {

    }

    @Override
    public void onFragmentDetached(String tag) {

    }

    @Override
    protected void onDestroy() {

        if (unBinder != null) {
            unBinder.unbind();
        }

        super.onDestroy();
    }

    protected abstract void setUp();
}
