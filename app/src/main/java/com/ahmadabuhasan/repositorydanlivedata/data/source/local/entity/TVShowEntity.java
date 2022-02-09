package com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity;

public class TVShowEntity {

    private String tvShowId;
    private String overview;
    private String posterPath;
    private String firstAirDate;
    private String title;
    private String voteAverage;

    public TVShowEntity(String tvShowId, String overview, String posterPath, String firstAirDate, String title, String voteAverage) {
        this.tvShowId = tvShowId;
        this.overview = overview;
        this.posterPath = posterPath;
        this.firstAirDate = firstAirDate;
        this.title = title;
        this.voteAverage = voteAverage;
    }

    public String getTvShowId() {
        return tvShowId;
    }

    public void setTvShowId(String tvShowId) {
        this.tvShowId = tvShowId;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public void setFirstAirDate(String firstAirDate) {
        this.firstAirDate = firstAirDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }
}