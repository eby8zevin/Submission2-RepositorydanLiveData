package com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity;

import com.google.gson.annotations.SerializedName;

public class MovieEntity {

    @SerializedName("id")
    private int movieId;

    @SerializedName("poster_path")
    private String moviePoster;

    @SerializedName("release_date")
    private String movieReleaseDate;

    @SerializedName("title")
    private String movieTitle;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public void setMovieReleaseDate(String movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
}
