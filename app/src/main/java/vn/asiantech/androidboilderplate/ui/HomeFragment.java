package vn.asiantech.androidboilderplate.ui;

import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import vn.asiantech.androidboilderplate.R;

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
}
