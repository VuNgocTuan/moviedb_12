package com.training.vungoctuan.moviedb.screen.home;

import com.training.vungoctuan.moviedb.data.model.Movie;
import com.training.vungoctuan.moviedb.screen.BasePresenter;

import java.util.List;

/**
 * Created by vungoctuan on 2/28/18.
 */
public class HomeContract {
    public interface View {
        void onGetPopularMoviesSuccess(List<Movie> movies);
        void onGetNowPlayingMoviesSuccess(List<Movie> movies);
    }

    public interface Presenter extends BasePresenter<View> {
        void loadPopularMovies();
        void loadNowPlayingMovies();
    }
}
