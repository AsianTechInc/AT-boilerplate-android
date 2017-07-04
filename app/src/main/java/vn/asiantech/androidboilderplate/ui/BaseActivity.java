package vn.asiantech.androidboilderplate.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import vn.asiantech.androidboilderplate.ui.MainActivity_;

/**
 * Copyright © AsianTech Co., Ltd
 * Created by kietva on 5/9/17.
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Handler Google Analytics View Mode at here
        // Sample
        if (this instanceof MainActivity_) {
            // Do something Google Analytics
        }
    }
}
