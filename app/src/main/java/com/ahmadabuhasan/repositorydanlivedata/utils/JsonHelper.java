package com.ahmadabuhasan.repositorydanlivedata.utils;

import android.content.Context;

import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.MovieResponse;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.TVShowResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class JsonHelper {

    private final Context context;

    public JsonHelper(Context context) {
        this.context = context;
    }

    private String parsingFileToString(String json) {
        try {
            InputStream inputStream = context.getAssets().open(json);
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            inputStream.close();
            return new String(bytes);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<MovieResponse> loadMovie() {
        ArrayList<MovieResponse> list = new ArrayList<>();
        try {
            String json = parsingFileToString("Movies.json");
            JSONObject responseObject;
            if (json != null) {
                responseObject = new JSONObject(json);
                JSONArray listArray = responseObject.getJSONArray("movies");
                for (int i = 0; i < listArray.length(); i++) {
                    JSONObject movie = listArray.getJSONObject(i);

                    String movieId = movie.getString("id");
                    String overview = movie.getString("overview");
                    String posterPath = movie.getString("poster_path");
                    String releaseDate = movie.getString("release_date");
                    String title = movie.getString("title");
                    String voteAverage = movie.getString("vote_average");

                    MovieResponse movieResponse = new MovieResponse(movieId, overview, posterPath, releaseDate, title, voteAverage);
                    list.add(movieResponse);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<TVShowResponse> loadTVShow() {
        ArrayList<TVShowResponse> list = new ArrayList<>();
        try {
            String json = parsingFileToString("TVShows.json");
            JSONObject responseObject;
            if (json != null) {
                responseObject = new JSONObject(json);
                JSONArray listArray = responseObject.getJSONArray("tvshows");
                for (int i = 0; i < listArray.length(); i++) {
                    JSONObject tvshow = listArray.getJSONObject(i);

                    String tvShowId = tvshow.getString("id");
                    String overview = tvshow.getString("overview");
                    String posterPath = tvshow.getString("poster_path");
                    String firstAirDate = tvshow.getString("first_air_date");
                    String title = tvshow.getString("title");
                    String voteAverage = tvshow.getString("vote_average");

                    TVShowResponse tvShowResponse = new TVShowResponse(tvShowId, overview, posterPath, firstAirDate, title, voteAverage);
                    list.add(tvShowResponse);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }
}