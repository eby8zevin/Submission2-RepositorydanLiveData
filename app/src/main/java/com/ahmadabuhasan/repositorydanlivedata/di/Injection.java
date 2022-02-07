package com.ahmadabuhasan.repositorydanlivedata.di;

import android.content.Context;

import com.ahmadabuhasan.repositorydanlivedata.data.AppRepository;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.RemoteDataSource;
import com.ahmadabuhasan.repositorydanlivedata.utils.JsonHelper;

public class Injection {

    public static AppRepository provideRepository(Context context) {
        RemoteDataSource remoteRepository = RemoteDataSource.getInstance(new JsonHelper(context));
        return AppRepository.getInstance(remoteRepository);
    }
}