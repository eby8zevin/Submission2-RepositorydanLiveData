package com.ahmadabuhasan.repositorydanlivedata.ui.movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.databinding.FragmentMovieBinding;

import java.util.List;

public class MovieFragment extends Fragment {

    private FragmentMovieBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMovieBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getActivity() != null) {
            MovieViewModel movieViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(MovieViewModel.class);
            List<MovieEntity> movie = movieViewModel.getMovies();

            MovieAdapter movieAdapter = new MovieAdapter();
            movieAdapter.setMovie(movie);

            binding.rvMovie.setLayoutManager(new LinearLayoutManager(getContext()));
            binding.rvMovie.setHasFixedSize(true);
            binding.rvMovie.setAdapter(movieAdapter);
        }
    }
}
