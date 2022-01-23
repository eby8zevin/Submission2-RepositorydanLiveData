package com.ahmadabuhasan.repositorydanlivedata.data.source;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.RemoteDataSource;

import java.util.List;

public class MovieCatalogueRepository implements MovieCatalogueDataSource {

    private volatile static MovieCatalogueRepository INSTANCE = null;

    private final RemoteDataSource remoteDataSource;

    private MovieCatalogueRepository(RemoteDataSource remoteDataSource) {
        this.remoteDataSource = remoteDataSource;
    }

    public static MovieCatalogueRepository getInstance(RemoteDataSource remoteData) {
        if (INSTANCE == null) {
            synchronized (MovieCatalogueRepository.class) {
                INSTANCE = new MovieCatalogueRepository(remoteData);
            }
        }
        return INSTANCE;
    }

    public LiveData<List<MovieEntity>> getMovies(){
        MutableLiveData<List<MovieEntity>> movieResults = new MutableLiveData<>();
        remoteDataSource.getMovies(movieResponse);
    }

}
