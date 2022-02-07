package com.ahmadabuhasan.repositorydanlivedata.ui.movie;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ahmadabuhasan.repositorydanlivedata.data.AppRepository;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;

import java.util.List;

public class MovieViewModel extends ViewModel {

    private AppRepository repository;

    public MovieViewModel(AppRepository mRepository) {
        this.repository = mRepository;
    }

    public LiveData<List<MovieEntity>> getMovies() {
        return repository.getAllMovies();
    }
}