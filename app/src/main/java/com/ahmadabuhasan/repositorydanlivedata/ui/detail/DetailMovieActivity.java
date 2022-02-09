package com.ahmadabuhasan.repositorydanlivedata.ui.detail;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.ahmadabuhasan.repositorydanlivedata.R;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.databinding.ActivityDetailMovieBinding;
import com.ahmadabuhasan.repositorydanlivedata.viewmodel.ViewModelFactory;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.Objects;

public class DetailMovieActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";
    private ActivityDetailMovieBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailMovieBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Objects.requireNonNull(getSupportActionBar()).hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewModelFactory factory = ViewModelFactory.getInstance(this);
        DetailMovieViewModel viewModel = new ViewModelProvider(this, factory).get(DetailMovieViewModel.class);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String movieId = extras.getString(EXTRA_MOVIE);
            if (movieId != null) {
                binding.progressBar.setVisibility(View.VISIBLE);
                viewModel.setSelectedMovie(movieId);
            }
            viewModel.getMovie().observe(this, this::populateMovie);
        }

        binding.toolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

    private void populateMovie(MovieEntity movieEntity) {
        binding.progressBar.setVisibility(View.INVISIBLE);
        binding.collapsingMovie.setTitle(movieEntity.getTitle());
        binding.ratingBar.setRating(Float.parseFloat(movieEntity.getVoteAverage()));
        binding.tvMovieDetailOverview.setText(movieEntity.getOverview());

        Glide.with(this)
                .load(movieEntity.getPosterPath())
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                .into(binding.ivMoviePoster);
    }
}