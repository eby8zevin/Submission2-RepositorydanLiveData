package com.ahmadabuhasan.repositorydanlivedata.ui.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ahmadabuhasan.repositorydanlivedata.data.AppRepository;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.TVShowEntity;

public class DetailTVShowViewModel extends ViewModel {

    private String tvShowId;
    private final AppRepository repository;

    public DetailTVShowViewModel(AppRepository mRepository) {
        this.repository = mRepository;
    }

    public void setSelectedTVShow(String tvShowId) {
        this.tvShowId = tvShowId;
    }

    public LiveData<TVShowEntity> getTVShow() {
        return repository.getDetailTVShow(tvShowId);
    }
}