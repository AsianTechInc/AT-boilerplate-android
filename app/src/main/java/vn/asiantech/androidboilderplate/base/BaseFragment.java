package vn.asiantech.androidboilderplate.base;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import vn.asiantech.androidboilderplate.ui.HomeFragment_;
import vn.asiantech.androidboilderplate.ui.MainActivity_;

/**
 * Copyright © AsianTech Co., Ltd
 * Created by kietva on 5/9/17.
 */
public class BaseFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Handler Google Analytics View Mode at here
        // Sample
        if (this instanceof HomeFragment_) {
            // Do something Google Analytics
        }
    }
}
