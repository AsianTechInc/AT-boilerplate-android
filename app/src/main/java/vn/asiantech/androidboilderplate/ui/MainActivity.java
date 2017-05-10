package vn.asiantech.androidboilderplate.ui;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.asiantech.androidboilderplate.R;
import vn.asiantech.androidboilderplate.api.ApiService;
import vn.asiantech.androidboilderplate.base.BaseActivity;
import vn.asiantech.androidboilderplate.eventbus.BusProvider;
import vn.asiantech.androidboilderplate.models.Test;
import vn.asiantech.androidboilderplate.models.TestRx;

/**
 * Copyright © AsianTech Co., Ltd
 * Created by kietva on 5/9/17.
 */
@EActivity(R.layout.activity_main)
public class MainActivity extends BaseActivity {

    @ViewById(R.id.imgView)
    ImageView mImageView;

    @AfterViews
    void afterViews() {
        // Test API Retrofit
        ApiService.getInstance().getApi().getResult().enqueue(new Callback<Test>() {
            @Override
            public void onResponse(Call<Test> call, Response<Test> response) {

            }

            @Override
            public void onFailure(Call<Test> call, Throwable t) {

            }
        });

        // Test Load Image From Internet
        Picasso.with(this).load("http://square.github.io/picasso/static/debug.png").into(mImageView);

        // Test RxJava and RxAndroid Synchronous with blocking call
        Observable<String> observable = Observable.just("dasda");
        observable.subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {

            }

            @Override
            public void onNext(@NonNull String s) {

            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

        // Test RXjava and RXAndroid Asynchronous with non-blocking call
        Observable<List<String>> listObservable = Observable.fromCallable(new Callable<List<String>>() {
            @Override
            public List<String> call() throws Exception {
                List<String> list = new ArrayList<>();
                list.add("test1");
                list.add("test2");
                list.add("test3");
                return list;
            }
        });
        listObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<String>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull List<String> strings) {
                        String text = strings.toString();
                        Test test = new Test();
                        test.setLogin(text);
                        BusProvider.getInstance().getBus().post(test);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


        // Test RxJava2Adapter + Retrofit
        Observable<TestRx> result = ApiService.getInstance().getApi().getResultWithRxJava2Adapter();
        result.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TestRx>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull TestRx test) {
                        // Send textRx object to Fragment
                        BusProvider.getInstance().getBus().post(test);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
