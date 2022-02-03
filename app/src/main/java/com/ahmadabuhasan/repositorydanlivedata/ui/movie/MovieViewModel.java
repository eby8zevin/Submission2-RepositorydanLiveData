package com.ahmadabuhasan.repositorydanlivedata.ui.movie;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ahmadabuhasan.repositorydanlivedata.data.MovieCatalogueRepository;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;

import java.util.List;

public class MovieViewModel extends ViewModel {

    private MovieCatalogueRepository repository;

    public MovieViewModel(MovieCatalogueRepository mRepository) {
        this.repository = mRepository;
    }

    public LiveData<List<MovieEntity>> getMovies() {
        return repository.getAllMovies();
    }
}