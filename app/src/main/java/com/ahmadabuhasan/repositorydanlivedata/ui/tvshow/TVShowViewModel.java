package com.ahmadabuhasan.repositorydanlivedata.ui.tvshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ahmadabuhasan.repositorydanlivedata.data.AppRepository;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.TVShowEntity;

import java.util.List;

public class TVShowViewModel extends ViewModel {

    private final AppRepository repository;

    public TVShowViewModel(AppRepository mRepository) {
        this.repository = mRepository;
    }

    public LiveData<List<TVShowEntity>> getTVShow() {
        return repository.getAllTVShows();
    }
}