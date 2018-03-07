package com.training.vungoctuan.moviedb.screen.detail;

import com.training.vungoctuan.moviedb.data.model.Production;
import com.training.vungoctuan.moviedb.data.model.credit.Credit;
import com.training.vungoctuan.moviedb.screen.BasePresenter;

import java.util.List;

/**
 * Created by vungoctuan on 3/1/18.
 */
public interface DetailContract {
    interface View {
        void onLoadProductionSuccess(List<Production> productions);
        void onLoadCreditSuccess(Credit credit);
    }

    interface Presenter extends BasePresenter<View> {
        void loadProductionsByMovieId(String movieId);
        void loadCreditByMovieId(String movieId);
    }
}
