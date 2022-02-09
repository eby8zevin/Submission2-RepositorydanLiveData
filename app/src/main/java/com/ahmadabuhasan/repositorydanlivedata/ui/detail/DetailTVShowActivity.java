package com.ahmadabuhasan.repositorydanlivedata.ui.detail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.ahmadabuhasan.repositorydanlivedata.R;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.TVShowEntity;
import com.ahmadabuhasan.repositorydanlivedata.databinding.ActivityDetailTvshowBinding;
import com.ahmadabuhasan.repositorydanlivedata.viewmodel.ViewModelFactory;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.Objects;

public class DetailTVShowActivity extends AppCompatActivity {

    public static final String EXTRA_TVSHOW = "extra_tvshow";
    private ActivityDetailTvshowBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailTvshowBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Objects.requireNonNull(getSupportActionBar()).hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewModelFactory factory = ViewModelFactory.getInstance(this);
        DetailTVShowViewModel viewModel = new ViewModelProvider(this, factory).get(DetailTVShowViewModel.class);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String tvShowId = extras.getString(EXTRA_TVSHOW);
            if (tvShowId != null) {
                binding.progressBar.setVisibility(View.VISIBLE);
                viewModel.setSelectedTVShow(tvShowId);
            }
            viewModel.getTVShow().observe(this, this::populateTVShow);
        }

        binding.toolbar.setNavigationOnClickListener(view -> onBackPressed());
    }

    private void populateTVShow(TVShowEntity tvShowEntity) {
        binding.progressBar.setVisibility(View.INVISIBLE);
        binding.collapsingTvshow.setTitle(tvShowEntity.getTitle());
        binding.ratingBar.setRating(Float.parseFloat(tvShowEntity.getVoteAverage()));
        binding.tvTvshowDetailOverview.setText(tvShowEntity.getOverview());

        Glide.with(this)
                .load(tvShowEntity.getPosterPath())
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                .into(binding.ivTvshowPoster);
    }
}