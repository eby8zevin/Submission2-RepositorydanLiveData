package com.ahmadabuhasan.repositorydanlivedata.viewmodel;

import android.content.Context;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.ahmadabuhasan.repositorydanlivedata.data.AppRepository;
import com.ahmadabuhasan.repositorydanlivedata.di.Injection;
import com.ahmadabuhasan.repositorydanlivedata.ui.movie.MovieViewModel;

public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private static volatile ViewModelFactory INSTANCE;
    private final AppRepository appRepository;

    private ViewModelFactory(AppRepository mAppRepository) {
        this.appRepository = mAppRepository;
    }

    public static ViewModelFactory getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (ViewModelFactory.class) {
                INSTANCE = new ViewModelFactory(Injection.provideRepository(context));
            }
        }
        return INSTANCE;
    }

    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MovieViewModel.class)) ;
        return (T) new MovieViewModel(appRepository);

    }
}