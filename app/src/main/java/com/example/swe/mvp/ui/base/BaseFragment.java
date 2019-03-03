package com.example.swe.mvp.ui.base;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import com.example.swe.mvp.di.component.ActivityComponent;

import androidx.annotation.Nullable;
import butterknife.Unbinder;

/**
 * @author swezinlinn
 */
public abstract class BaseFragment extends Fragment implements ViewInterface {
    private static final String TAG = BaseActivity.class.getSimpleName();

    private BaseActivity activity;
    private Unbinder mUnBinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof BaseActivity){
            BaseActivity activity = (BaseActivity) context;
            this.activity = activity;
            activity.onFragmentAttached();
        }
    }

    public void setUnBinder(Unbinder unBinder) {
        unBinder = unBinder;
    }


    public ActivityComponent getActivityComponent(){
        return activity.getActivityComponent();
    }


    @Override
    public void onDetach() {
        activity = null;
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        if (mUnBinder != null){
            mUnBinder.unbind();
        }
        super.onDestroy();
    }

    public interface Callback {
        void onFragmentAttached();

        void onFragmentDetached(String tag);
    }
}
