package vn.asiantech.androidboilderplate.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.squareup.otto.Subscribe;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import vn.asiantech.androidboilderplate.R;
import vn.asiantech.androidboilderplate.base.BaseFragment;
import vn.asiantech.androidboilderplate.eventbus.BusProvider;
import vn.asiantech.androidboilderplate.models.Test;
import vn.asiantech.androidboilderplate.models.TestRx;

/**
 * Copyright © AsianTech Co., Ltd
 * Created by kietva on 5/9/17.
 */
@EFragment(R.layout.fragment_home)
public class HomeFragment extends BaseFragment {

    @ViewById(R.id.tvData)
    TextView mTvData;

    @ViewById(R.id.tvRxAndroid)
    TextView mTvRxAndroid;


    @AfterViews
    void afterViews() {

    }

    @Subscribe
    public void getDataFromActivity(Test data) {
        mTvData.setText(data != null ? data.getLogin() : null);
    }

    @Subscribe
    public void getDataRx(TestRx data) {
        mTvRxAndroid.setText(data != null ? data.getLogin() : null);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BusProvider.getInstance().getBus().register(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        BusProvider.getInstance().getBus().unregister(this);
    }
}
