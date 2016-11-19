package com.example.mambayamba.stackoverflowviewer.rest;

import com.example.mambayamba.stackoverflowviewer.model.question.featured.Item;
import com.example.mambayamba.stackoverflowviewer.model.question.featured.JsonFeaturedResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.FeaturedFragmentPresenter;

import java.util.List;

import me.tatarka.rxloader.RxLoaderObserver;

/**
 * Created by mambayamba on 19.11.2016.
 */
public class FeaturedQuestionObserver extends RxLoaderObserver<JsonFeaturedResponse> {
    private FeaturedFragmentPresenter presenter;

    public FeaturedQuestionObserver(FeaturedFragmentPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onStarted() {
        presenter.passShowLoading();
    }

    @Override
    public void onNext(JsonFeaturedResponse value) {
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
