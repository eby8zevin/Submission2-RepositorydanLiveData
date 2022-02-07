package com.ahmadabuhasan.repositorydanlivedata.data.source.remote;

import android.os.Handler;
import android.os.Looper;

import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.MovieResponse;
import com.ahmadabuhasan.repositorydanlivedata.utils.EspressoIdlingResource;
import com.ahmadabuhasan.repositorydanlivedata.utils.JsonHelper;

import java.util.List;

public class RemoteDataSource {

    private static RemoteDataSource INSTANCE;
    private JsonHelper jsonHelper;
    private Handler handler = new Handler(Looper.getMainLooper());
    private final long LOADING = 3000;

    private RemoteDataSource(JsonHelper jsonHelper) {
        this.jsonHelper = jsonHelper;
    }

    public static RemoteDataSource getInstance(JsonHelper helper) {
        if (INSTANCE == null) {
            INSTANCE = new RemoteDataSource(helper);
        }
        return INSTANCE;
    }

    public void getMovies(LoadMoviesCallback callback) {
        EspressoIdlingResource.increment();
        handler.postDelayed(() -> {
            callback.onMoviesReceived(jsonHelper.loadMovie());
            EspressoIdlingResource.decrement();
        }, LOADING);
    }

    public interface LoadMoviesCallback {
        void onMoviesReceived(List<MovieResponse> movieResponses);
    }
}