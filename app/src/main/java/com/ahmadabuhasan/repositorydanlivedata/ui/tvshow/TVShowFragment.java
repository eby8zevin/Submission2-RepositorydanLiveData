package com.ahmadabuhasan.repositorydanlivedata.ui.tvshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.ahmadabuhasan.repositorydanlivedata.databinding.FragmentTvshowBinding;
import com.ahmadabuhasan.repositorydanlivedata.viewmodel.ViewModelFactory;

public class TVShowFragment extends Fragment {

    private FragmentTvshowBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentTvshowBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getActivity() != null) {
            ViewModelFactory factory = ViewModelFactory.getInstance(getActivity());
            TVShowViewModel viewModel = new ViewModelProvider(this, factory).get(TVShowViewModel.class);

            binding.progressBar.setVisibility(View.VISIBLE);

            TVShowAdapter tvShowAdapter = new TVShowAdapter();
            viewModel.getTVShow().observe(getViewLifecycleOwner(), tvShowEntities -> {
                binding.progressBar.setVisibility(View.GONE);
                tvShowAdapter.setTVShow(tvShowEntities);
                tvShowAdapter.notifyDataSetChanged();
            });

            binding.rvTvshow.setLayoutManager(new LinearLayoutManager(getContext()));
            binding.rvTvshow.setHasFixedSize(true);
            binding.rvTvshow.setAdapter(tvShowAdapter);
        }
    }
}