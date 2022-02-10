package com.ahmadabuhasan.repositorydanlivedata.ui.tvshow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.ahmadabuhasan.repositorydanlivedata.data.AppRepository;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.TVShowEntity;
import com.ahmadabuhasan.repositorydanlivedata.utils.DataDummy;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TVShowViewModelTest {

    private TVShowViewModel viewModel;

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Mock
    private AppRepository repository;

    @Mock
    private Observer<List<TVShowEntity>> observer;

    @Before
    public void setUp() {
        viewModel = new TVShowViewModel(repository);
    }

    @Test
    public void getTVShow() {
        ArrayList<TVShowEntity> dummyTVShow = DataDummy.generateDummyTVShows();
        MutableLiveData<List<TVShowEntity>> tvShows = new MutableLiveData<>();
        tvShows.setValue(dummyTVShow);

        when(repository.getAllTVShows()).thenReturn(tvShows);
        List<TVShowEntity> tvShowEntities = viewModel.getTVShow().getValue();
        verify(repository).getAllTVShows();
        assertNotNull(tvShowEntities);
        assertEquals(11, tvShowEntities.size());

        viewModel.getTVShow().observeForever(observer);
        verify(observer).onChanged(dummyTVShow);
    }
}