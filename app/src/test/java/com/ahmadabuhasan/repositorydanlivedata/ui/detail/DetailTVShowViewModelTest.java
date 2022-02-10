package com.ahmadabuhasan.repositorydanlivedata.ui.detail;

import static org.junit.Assert.*;
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

@RunWith(MockitoJUnitRunner.class)
public class DetailTVShowViewModelTest {

    private DetailTVShowViewModel viewModel;
    private final TVShowEntity dummyTVShow = DataDummy.generateDummyTVShows().get(0);
    private final String tvShowId = dummyTVShow.getTvShowId();

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Mock
    private AppRepository repository;

    @Mock
    private Observer<TVShowEntity> observer;

    @Before
    public void setUp() {
        viewModel = new DetailTVShowViewModel(repository);
        viewModel.setSelectedTVShow(tvShowId);
    }

    @Test
    public void setSelectedTVShow() {
        MutableLiveData<TVShowEntity> course = new MutableLiveData<>();
        course.setValue(dummyTVShow);
        when(repository.getDetailTVShow(tvShowId)).thenReturn(course);
        TVShowEntity tvShowEntity = viewModel.getTVShow().getValue();
        verify(repository).getDetailTVShow(tvShowId);
        assertNotNull(tvShowEntity);
        assertEquals(dummyTVShow.getTvShowId(), tvShowEntity.getTvShowId());
        assertEquals(dummyTVShow.getPosterPath(), tvShowEntity.getPosterPath());
        assertEquals(dummyTVShow.getTitle(), tvShowEntity.getTitle());
        assertEquals(dummyTVShow.getVoteAverage(), tvShowEntity.getVoteAverage());
        assertEquals(dummyTVShow.getOverview(), tvShowEntity.getOverview());

        viewModel.getTVShow().observeForever(observer);
        verify(observer).onChanged(dummyTVShow);
    }
}