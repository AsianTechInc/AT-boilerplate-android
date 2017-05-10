package vn.asiantech.androidboilderplate.api;

import java.net.HttpURLConnection;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Copyright © AsianTech Co., Ltd
 * Created by kietva on 3/28/17.
 */
public abstract class ApiResponse<T> implements Callback<T> {

    public abstract void onResponse(T t);

    public abstract void onError(ApiError apiError);

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.isSuccessful()) {
            onResponse(response.body());
        } else {
            onError(new ApiError(response.code(), response.message()));
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        onError(new ApiError(HttpURLConnection.HTTP_INTERNAL_ERROR, t.getMessage()));
    }
}
