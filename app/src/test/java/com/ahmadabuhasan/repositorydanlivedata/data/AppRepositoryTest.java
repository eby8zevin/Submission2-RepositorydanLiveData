package com.ahmadabuhasan.repositorydanlivedata.data;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;

import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.TVShowEntity;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.RemoteDataSource;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.MovieResponse;
import com.ahmadabuhasan.repositorydanlivedata.data.source.remote.response.TVShowResponse;
import com.ahmadabuhasan.repositorydanlivedata.utils.DataDummy;
import com.ahmadabuhasan.repositorydanlivedata.utils.LiveDataTestUtil;

import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AppRepositoryTest {

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    private final RemoteDataSource remote = mock(RemoteDataSource.class);
    private final FakeAppRepository fakeAppRepository = new FakeAppRepository(remote);

    private final ArrayList<MovieResponse> movieResponses = DataDummy.generateRemoteDummyMovie();
    private final String movieId = movieResponses.get(0).getMovieId();

    private final ArrayList<TVShowResponse> tvShowResponses = DataDummy.generateRemoteDummyTVShows();
    private final String tvShowId = tvShowResponses.get(0).getTvShowId();

    @Test
    public void getAllMovies() {
        doAnswer(invocation -> {
            ((RemoteDataSource.LoadMoviesCallback) invocation.getArguments()[0])
                    .onMoviesReceived(movieResponses);
            return null;
        }).when(remote).getMovies(any(RemoteDataSource.LoadMoviesCallback.class));
        List<MovieEntity> movieEntities = LiveDataTestUtil.getValue(fakeAppRepository.getAllMovies());
        verify(remote).getMovies(any(RemoteDataSource.LoadMoviesCallback.class));
        assertNotNull(movieEntities);
        assertEquals(movieResponses.size(), movieEntities.size());
    }

    @Test
    public void getAllTVShows() {
        doAnswer(invocation -> {
            ((RemoteDataSource.LoadTVShowsCallback) invocation.getArguments()[0])
                    .onTVShowsReceived(tvShowResponses);
            return null;
        }).when(remote).getTVShows(any(RemoteDataSource.LoadTVShowsCallback.class));
        List<TVShowEntity> tvShowEntities = LiveDataTestUtil.getValue(fakeAppRepository.getAllTVShows());
        verify(remote).getTVShows(any(RemoteDataSource.LoadTVShowsCallback.class));
        assertNotNull(tvShowEntities);
        assertEquals(tvShowResponses.size(), tvShowEntities.size());
    }

    @Test
    public void getDetailMovie() {
        doAnswer(invocation -> {
            ((RemoteDataSource.LoadMoviesCallback) invocation.getArguments()[0])
                    .onMoviesReceived(movieResponses);
            return null;
        }).when(remote).getMovies(any(RemoteDataSource.LoadMoviesCallback.class));
        MovieEntity movieEntity = LiveDataTestUtil.getValue(fakeAppRepository.getDetailMovie(movieId));
        verify(remote).getMovies(any(RemoteDataSource.LoadMoviesCallback.class));
        assertNotNull(movieEntity);
        assertEquals(movieResponses.get(0).getMovieId(), movieEntity.getMovieId());
    }

    @Test
    public void getDetailTVShow() {
        doAnswer(invocation -> {
            ((RemoteDataSource.LoadTVShowsCallback) invocation.getArguments()[0])
                    .onTVShowsReceived(tvShowResponses);
            return null;
        }).when(remote).getTVShows(any(RemoteDataSource.LoadTVShowsCallback.class));
        TVShowEntity tvShowEntity = LiveDataTestUtil.getValue(fakeAppRepository.getDetailTVShow(tvShowId));
        verify(remote).getTVShows(any(RemoteDataSource.LoadTVShowsCallback.class));
        assertNotNull(tvShowEntity);
        assertEquals(tvShowResponses.get(0).getTvShowId(), tvShowEntity.getTvShowId());
    }
}