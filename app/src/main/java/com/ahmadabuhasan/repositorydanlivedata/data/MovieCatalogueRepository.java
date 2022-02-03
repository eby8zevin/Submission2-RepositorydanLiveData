package com.ahmadabuhasan.repositorydanlivedata.data;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.RemoteDataSource;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.MovieResponse;

import java.util.ArrayList;
import java.util.List;

public class MovieCatalogueRepository implements RemoteDataSource {

    private volatile static MovieCatalogueRepository INSTANCE = null;

    private final RemoteDataSource remoteDataSource;

    private MovieCatalogueRepository(@NonNull RemoteDataSource mRemoteDataSource) {
        this.remoteDataSource = mRemoteDataSource;
    }

    public static MovieCatalogueRepository getInstance(RemoteDataSource remoteData) {
        if (INSTANCE == null) {
            synchronized (MovieCatalogueRepository.class) {
                INSTANCE = new MovieCatalogueRepository(remoteData);
            }
        }
        return INSTANCE;
    }

    public LiveData<List<MovieEntity>> getAllMovies() {
        MutableLiveData<List<MovieEntity>> movieResults = new MutableLiveData<>();
        remoteDataSource.getAllMovies(movieResponses -> {
            ArrayList<MovieEntity> movieList= new ArrayList<>();
            for (MovieResponse response: movieResponses){
                MovieEntity movie = new MovieEntity(response.getPage(),
                        response.getResults(),
                        response.getTotalPages(),
                        response.getTotalResults());

                movieList.add(movie);
            }
        });

        return movieResults;
    }
}