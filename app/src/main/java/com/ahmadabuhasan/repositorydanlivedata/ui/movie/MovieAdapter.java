package com.ahmadabuhasan.repositorydanlivedata.ui.movie;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmadabuhasan.repositorydanlivedata.R;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.databinding.ItemListBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private final List<MovieEntity> listMovie = new ArrayList<>();

    void setMovie(List<MovieEntity> listMovie) {
        if (listMovie == null) return;
        this.listMovie.clear();
        this.listMovie.addAll(listMovie);
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListBinding binding = ItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MovieViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        MovieEntity movieEntity = listMovie.get(position);
        Glide.with(holder.itemView.getContext())
                .load(movieEntity.getPosterPath())
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                .into(holder.binding.ivPoster);
        holder.binding.tvTitle.setText(movieEntity.getTitle());
        holder.binding.tvRelease.setText(movieEntity.getReleaseDate());
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        private final ItemListBinding binding;

        public MovieViewHolder(@NonNull ItemListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}