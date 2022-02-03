package com.ahmadabuhasan.repositorydanlivedata.viewmodel;

import android.content.Context;

import androidx.lifecycle.ViewModelProvider;

import com.ahmadabuhasan.repositorydanlivedata.data.MovieCatalogueRepository;
import com.ahmadabuhasan.repositorydanlivedata.di.Injection;

public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private static volatile ViewModelFactory INSTANCE;

    private final MovieCatalogueRepository repository;

    private ViewModelFactory(MovieCatalogueRepository mRepository) {
        this.repository = mRepository;
    }

    public static ViewModelFactory getInstance(Context context){
        if (INSTANCE==null){
            synchronized (ViewModelFactory.class){
                INSTANCE = new ViewModelFactory(Injection.provideRepository());
            }
        }
    }


}