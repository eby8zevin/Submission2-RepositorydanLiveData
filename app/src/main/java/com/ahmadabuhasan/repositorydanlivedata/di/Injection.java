package com.ahmadabuhasan.repositorydanlivedata.di;

import com.ahmadabuhasan.repositorydanlivedata.data.MovieCatalogueRepository;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.RemoteDataSource;

public class Injection {

    public static MovieCatalogueRepository provideRepository() {
        RemoteDataSource remoteDataSource = RemoteDataSource.getInstance();
        return MovieCatalogueRepository.getInstance(remoteDataSource);
    }
}