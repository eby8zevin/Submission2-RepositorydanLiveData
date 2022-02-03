package com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity;

import com.google.gson.annotations.SerializedName;

public class MovieEntity {

    @SerializedName("id")
    private int movieId;

    @SerializedName("overview")
    private String overview;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("title")
    private String title;

}