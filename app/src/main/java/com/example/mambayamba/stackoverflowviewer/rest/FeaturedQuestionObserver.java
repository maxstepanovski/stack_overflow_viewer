package com.example.mambayamba.stackoverflowviewer.rest;

import com.example.mambayamba.stackoverflowviewer.model.questionlist.featured.Item;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.featured.FeaturedQuestionListResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.FeaturedFragmentPresenter;

import java.util.List;

import me.tatarka.rxloader.RxLoaderObserver;

/**
 * Created by mambayamba on 19.11.2016.
 */
public class FeaturedQuestionObserver extends RxLoaderObserver<FeaturedQuestionListResponse> {
    private FeaturedFragmentPresenter presenter;

    public FeaturedQuestionObserver(FeaturedFragmentPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onStarted() {
        presenter.passShowLoading();
    }

    @Override
    public void onNext(FeaturedQuestionListResponse value) {
        List<Item> questions = value.getItems();
        for(Item item:questions)
            presenter.passShowList(questions);
    }

    @Override
    public void onCompleted() {
        presenter.passHideLoading();
    }

    @Override
    public void onError(Throwable e) {
        presenter.passShowError();
    }
}
