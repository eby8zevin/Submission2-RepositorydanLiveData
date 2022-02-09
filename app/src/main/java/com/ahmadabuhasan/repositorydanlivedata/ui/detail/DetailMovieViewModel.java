package com.ahmadabuhasan.repositorydanlivedata.ui.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ahmadabuhasan.repositorydanlivedata.data.AppRepository;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;

public class DetailMovieViewModel extends ViewModel {

    private String movieId;
    private final AppRepository repository;

    public DetailMovieViewModel(AppRepository mRepository) {
        this.repository = mRepository;
    }

    public void setSelectedMovie(String movieId) {
        this.movieId = movieId;
    }

    public LiveData<MovieEntity> getMovie() {
        return repository.getDetailMovie(movieId);
    }
}