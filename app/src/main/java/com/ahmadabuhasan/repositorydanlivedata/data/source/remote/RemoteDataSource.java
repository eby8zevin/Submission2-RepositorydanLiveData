package com.ahmadabuhasan.repositorydanlivedata.data.source.remote;

import android.util.Log;

import com.ahmadabuhasan.repositorydanlivedata.BuildConfig;
import com.ahmadabuhasan.repositorydanlivedata.api.ApiConfig;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.MovieResponse;
import com.ahmadabuhasan.repositorydanlivedata.utils.EspressoIdlingResource;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RemoteDataSource {

    private static final String TAG = "RemoteDataSource";
    private static RemoteDataSource INSTANCE;
    private final String API_KEY = BuildConfig.API_KEY;

    public RemoteDataSource getInstance() {
        if (INSTANCE == null) {
            synchronized (this) {
                INSTANCE = new RemoteDataSource();
            }
        }
        return INSTANCE;
    }

    public void getAllMovies(LoadMoviesCallback callback) {
        try {
            EspressoIdlingResource.increment();
            Call<MovieResponse> client = ApiConfig.getApiService().getMovies(API_KEY);
            client.enqueue(new Callback<MovieResponse>() {
                @Override
                public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                    callback.onAllMoviesReceived(response.body().results);
                    EspressoIdlingResource.increment();
                }

                @Override
                public void onFailure(Call<MovieResponse> call, Throwable t) {
                    Log.e(TAG, "getMovies onFailure:" + t.getMessage());
                    EspressoIdlingResource.increment();
                }
            });
        } catch (Exception e) {
            Log.d("API e", String.valueOf(e));
        }
    }

    public interface LoadMoviesCallback {
        void onAllMoviesReceived(List<MovieEntity> movieResponses);
    }
}