package com.ahmadabuhasan.repositorydanlivedata.ui.movie;

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

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MovieViewModelTest {

    private MovieViewModel viewModel;

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Mock
    private AppRepository repository;

    @Mock
    private Observer<List<MovieEntity>> observer;

    @Before
    public void setUp() {
        viewModel = new MovieViewModel(repository);
    }

    @Test
    public void getMovies() {
        ArrayList<MovieEntity> dummyMovie = DataDummy.generateDummyMovies();
        MutableLiveData<List<MovieEntity>> movies = new MutableLiveData<>();
        movies.setValue(dummyMovie);

        when(repository.getAllMovies()).thenReturn(movies);
        List<MovieEntity> movieEntities = viewModel.getMovies().getValue();
        verify(repository).getAllMovies();
        assertNotNull(movieEntities);
        assertEquals(11, movieEntities.size());

        viewModel.getMovies().observeForever(observer);
        verify(observer).onChanged(dummyMovie);
    }
}