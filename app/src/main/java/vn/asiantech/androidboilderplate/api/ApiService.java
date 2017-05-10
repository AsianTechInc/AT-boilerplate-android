package vn.asiantech.androidboilderplate.api;

import android.content.Context;
import android.support.annotation.NonNull;

import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import vn.asiantech.androidboilderplate.BuildConfig;

import static vn.asiantech.androidboilderplate.api.ApiConstant.SERVER_DOMAIN_NAME;

/**
 * Copyright © AsianTech Co., Ltd
 * Created by kietva on 3/28/17.
 */
public final class ApiService {
    private static final int CONNECT_TIMEOUT_MILLS = 1000 * 30;
    private static ApiService sInstance;
    private Retrofit mRetrofit;
    private Api mApi;

    private ApiService() {
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder()
                .connectTimeout(CONNECT_TIMEOUT_MILLS, TimeUnit.MILLISECONDS)
                .readTimeout(CONNECT_TIMEOUT_MILLS, TimeUnit.MILLISECONDS)
                .writeTimeout(CONNECT_TIMEOUT_MILLS, TimeUnit.MILLISECONDS);

        if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
            okHttpClientBuilder.addInterceptor(interceptor);
        }

        mRetrofit = new Retrofit.Builder()
                .baseUrl(SERVER_DOMAIN_NAME)
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClientBuilder.build())
                .build();
        mApi = mRetrofit.create(Api.class);
    }

    /**
     * Get instance of ApiService with out init.
     * Please take care when using it before init.
     *
     * @return sInstance
     */
    public static ApiService getInstance() {
        if (sInstance == null) {
            sInstance = new ApiService();
        }
        return sInstance;
    }

    public Api getApi() {
        return mApi;
    }

    Retrofit getRetrofit() {
        return mRetrofit;
    }

}
