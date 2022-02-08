package com.ahmadabuhasan.repositorydanlivedata.data;

import androidx.lifecycle.LiveData;

import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.TVShowEntity;

import java.util.List;

public interface AppDataSource {

    LiveData<List<MovieEntity>> getAllMovies();

    LiveData<List<TVShowEntity>> getAllTVShows();
}