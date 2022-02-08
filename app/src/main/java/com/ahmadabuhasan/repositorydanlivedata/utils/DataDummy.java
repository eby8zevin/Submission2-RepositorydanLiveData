package com.ahmadabuhasan.repositorydanlivedata.utils;

import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;

import java.util.ArrayList;

public class DataDummy {

    public static ArrayList<MovieEntity> generateDummyMovies() {
        ArrayList<MovieEntity> movies = new ArrayList<>();

        movies.add(new MovieEntity(
                634649,
                "Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.",
                "https://image.tmdb.org/t/p/w500/1g0dhYtq4irTY1GPXvft6k4YLjm.jpg",
                "2021-12-15",
                "Spider-Man: No Way Home",
                8.4
        ));
        return movies;
    }
}