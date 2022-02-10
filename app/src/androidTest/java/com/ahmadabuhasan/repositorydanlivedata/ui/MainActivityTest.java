package com.ahmadabuhasan.repositorydanlivedata.ui;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.swipeUp;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.contrib.RecyclerViewActions;

import com.ahmadabuhasan.repositorydanlivedata.R;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.MovieEntity;
import com.ahmadabuhasan.repositorydanlivedata.data.source.local.entity.TVShowEntity;
import com.ahmadabuhasan.repositorydanlivedata.utils.DataDummy;
import com.ahmadabuhasan.repositorydanlivedata.utils.EspressoIdlingResource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class MainActivityTest {

    private final ArrayList<MovieEntity> dummyMovies = DataDummy.generateDummyMovies();
    private final ArrayList<TVShowEntity> dummyTVShows = DataDummy.generateDummyTVShows();

    @Before
    public void setUp() {
        ActivityScenario.launch(MainActivity.class);
        IdlingRegistry.getInstance().register(EspressoIdlingResource.getEspressoIdlingResource());
    }

    @After
    public void tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.getEspressoIdlingResource());
    }

    @Test
    public void loadMovies() {
        delayThreeSecond();
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition(dummyMovies.size()));
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition(10, scrollTo()));
    }

    @Test
    public void loadDetailMovie() {
        delayThreeSecond();
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));

        // Poster
        onView(withId(R.id.iv_movie_poster)).check(matches(isDisplayed()));

        // Title
        onView(allOf(withId(R.id.collapsing_movie)
                , withText(dummyMovies.get(0).getTitle())
                , withContentDescription("Title")
                , isDisplayed()));

        // Rating
        onView(withId(R.id.rating_bar)).check(matches(isDisplayed()));

        // Overview
        onView(withId(R.id.tv_movie_detail_overview)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_movie_detail_overview)).check(matches(withText(dummyMovies.get(0).getOverview())));

        // Scroll
        onView(withId(R.id.appbar_movie)).check(matches(isDisplayed()));
        onView(withId(R.id.appbar_movie)).perform(click(), swipeUp());
    }

    @Test
    public void loadTVShow() {
        delayThreeSecond();
        onView(withText("TV Show")).perform(click());
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition(dummyTVShows.size()));
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition(10, scrollTo()));
    }

    @Test
    public void loadDetailTVShow() {
        delayThreeSecond();
        onView(withText("TV Show")).perform(click());
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));

        // Poster
        onView(withId(R.id.iv_tvshow_poster)).check(matches(isDisplayed()));

        // Title
        onView(allOf(withId(R.id.collapsing_tvshow)
                , withText(dummyTVShows.get(0).getTitle())
                , withContentDescription("Title")
                , isDisplayed()));

        // Rating
        onView(withId(R.id.rating_bar)).check(matches(isDisplayed()));

        // Overview
        onView(withId(R.id.tv_tvshow_detail_overview)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_tvshow_detail_overview)).check(matches(withText(dummyTVShows.get(0).getOverview())));

        // Scroll
        onView(withId(R.id.appbar_tvshow)).check(matches(isDisplayed()));
        onView(withId(R.id.appbar_tvshow)).perform(click(), swipeUp());
    }

    private void delayThreeSecond() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}