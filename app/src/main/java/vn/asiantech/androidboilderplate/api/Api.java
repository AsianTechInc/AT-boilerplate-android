package vn.asiantech.androidboilderplate.api;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import vn.asiantech.androidboilderplate.models.Test;
import vn.asiantech.androidboilderplate.models.TestRx;

/**
 * Copyright © AsianTech Co., Ltd
 * Created by kietva on 5/9/17.
 */
public interface Api {


    // Old way
    @GET("/users/kietvo")
    Call<Test> getResult();


    // New way using ReactiveX (RxJava & RxAndroid) with RxJava2Adapter + retrofit
    @GET("/users/asiantech")
    Observable<TestRx> getResultWithRxJava2Adapter();
}
