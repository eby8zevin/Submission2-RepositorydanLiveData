package com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.movie;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse implements Parcelable {

    @SerializedName("page")
    private int page;

    @SerializedName("results")
    private List<>;

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("total_results")
    private int totalResults;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
