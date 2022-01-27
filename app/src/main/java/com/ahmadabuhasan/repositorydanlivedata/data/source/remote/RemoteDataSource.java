package com.ahmadabuhasan.repositorydanlivedata.data.source.remote;

public class RemoteDataSource {

    private static RemoteDataSource INSTANCE;

    public static RemoteDataSource getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new RemoteDataSource();
        }
        return INSTANCE;
    }
}
