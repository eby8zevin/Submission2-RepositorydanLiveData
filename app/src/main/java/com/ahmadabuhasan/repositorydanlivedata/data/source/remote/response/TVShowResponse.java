package com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response;

import android.os.Parcel;
import android.os.Parcelable;

public class TVShowResponse implements Parcelable {

    private String tvShowId;
    private String overview;
    private String posterPath;
    private String firstAirDate;
    private String title;
    private String voteAverage;

    public TVShowResponse(String tvShowId, String overview, String posterPath, String firstAirDate, String title, String voteAverage) {
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

    protected TVShowResponse(Parcel in) {
        tvShowId = in.readString();
        overview = in.readString();
        posterPath = in.readString();
        firstAirDate = in.readString();
        title = in.readString();
        voteAverage = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tvShowId);
        dest.writeString(overview);
        dest.writeString(posterPath);
        dest.writeString(firstAirDate);
        dest.writeString(title);
        dest.writeString(voteAverage);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<TVShowResponse> CREATOR = new Creator<TVShowResponse>() {
        @Override
        public TVShowResponse createFromParcel(Parcel in) {
            return new TVShowResponse(in);
        }

        @Override
        public TVShowResponse[] newArray(int size) {
            return new TVShowResponse[size];
        }
    };
}