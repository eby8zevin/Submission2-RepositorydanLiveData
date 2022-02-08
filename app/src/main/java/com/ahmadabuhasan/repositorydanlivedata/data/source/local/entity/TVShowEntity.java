package com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity;

public class TVShowEntity {

    private int tvShowId;
    private String overview;
    private String posterPath;
    private String firstAirDate;
    private String title;
    private Double voteAverage;

    public TVShowEntity(int tvShowId, String overview, String posterPath, String firstAirDate, String title, Double voteAverage) {
        this.tvShowId = tvShowId;
        this.overview = overview;
        this.posterPath = posterPath;
        this.firstAirDate = firstAirDate;
        this.title = title;
        this.voteAverage = voteAverage;
    }

    public int getTvShowId() {
        return tvShowId;
    }

    public void setTvShowId(int tvShowId) {
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

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }
}