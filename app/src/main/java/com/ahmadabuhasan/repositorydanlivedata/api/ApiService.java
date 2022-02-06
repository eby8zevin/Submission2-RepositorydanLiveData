package com.ahmadabuhasan.repositorydanlivedata.api;

import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.movie.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("discover/movie")
    Call<MovieResponse> getMovies(
            @Query("api_key") String apiKey);

}