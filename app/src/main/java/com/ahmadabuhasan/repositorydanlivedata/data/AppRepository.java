package com.ahmadabuhasan.repositorydanlivedata.data;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.RemoteDataSource;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.MovieResponse;

import java.util.ArrayList;
import java.util.List;

public class AppRepository implements AppDataSource {

    private volatile static AppRepository INSTANCE = null;
    private final RemoteDataSource remoteDataSource;

    private AppRepository(RemoteDataSource remoteDataSource) {
        this.remoteDataSource = remoteDataSource;
    }

    public static AppRepository getInstance(RemoteDataSource remoteData) {
        if (INSTANCE == null) {
            synchronized (AppRepository.class) {
                INSTANCE = new AppRepository(remoteData);
            }
        }
        return INSTANCE;
    }

    public LiveData<List<MovieEntity>> getAllMovies() {
        MutableLiveData<List<MovieEntity>> movieResults = new MutableLiveData<>();
        remoteDataSource.getMovies(movieResponses -> {
            ArrayList<MovieEntity> movieList = new ArrayList<>();
            for (MovieResponse response : movieResponses) {
                MovieEntity movie = new MovieEntity(
                        response.getMovieId(),
                        response.getOverview(),
                        response.getPosterPath(),
                        response.getReleaseDate(),
                        response.getTitle(),
                        response.getVoteAverage());

                movieList.add(movie);
            }
            movieResults.postValue(movieList);
        });
        return movieResults;
    }
}