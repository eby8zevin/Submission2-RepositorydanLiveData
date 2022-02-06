package com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.movie;

import com.google.gson.annotations.SerializedName;

public class Genre {

    @SerializedName("id")
    private int genreId;

    @SerializedName("name")
    private String name;

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}