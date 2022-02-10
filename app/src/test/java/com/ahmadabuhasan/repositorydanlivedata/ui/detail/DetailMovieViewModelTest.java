package com.ahmadabuhasan.repositorydanlivedata.ui.detail;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.ahmadabuhasan.repositorydanlivedata.data.AppRepository;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.utils.DataDummy;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DetailMovieViewModelTest {

    private DetailMovieViewModel viewModel;
    private final MovieEntity dummyMovie = DataDummy.generateDummyMovies().get(0);
    private final String movieId = dummyMovie.getMovieId();

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Mock
    private AppRepository repository;

    @Mock
    private Observer<MovieEntity> observer;

    @Before
    public void setUp() {
        viewModel = new DetailMovieViewModel(repository);
        viewModel.setSelectedMovie(movieId);
    }

    @Test
    public void setSelectedMovie() {
        MutableLiveData<MovieEntity> movie = new MutableLiveData<>();
        movie.setValue(dummyMovie);
        when(repository.getDetailMovie(movieId)).thenReturn(movie);
        MovieEntity movieEntity = viewModel.getMovie().getValue();
        verify(repository).getDetailMovie(movieId);
        assertNotNull(movieEntity);
        assertEquals(dummyMovie.getMovieId(), movieEntity.getMovieId());
        assertEquals(dummyMovie.getPosterPath(), movieEntity.getPosterPath());
        assertEquals(dummyMovie.getTitle(), movieEntity.getTitle());
        assertEquals(dummyMovie.getVoteAverage(), movieEntity.getVoteAverage());
        assertEquals(dummyMovie.getOverview(), movieEntity.getOverview());

        viewModel.getMovie().observeForever(observer);
        verify(observer).onChanged(dummyMovie);
    }
}