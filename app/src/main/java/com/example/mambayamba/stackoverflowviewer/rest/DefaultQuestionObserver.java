package com.example.mambayamba.stackoverflowviewer.rest;

import com.example.mambayamba.stackoverflowviewer.model.question.average.Item;
import com.example.mambayamba.stackoverflowviewer.model.question.average.JsonQuestionResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.DefaultFragmentPresenter;

import java.util.List;

import me.tatarka.rxloader.RxLoaderObserver;

/**
 * Created by mambayamba on 16.11.2016.
 */
public class DefaultQuestionObserver extends RxLoaderObserver<JsonQuestionResponse> {
    private DefaultFragmentPresenter presenter;

    public DefaultQuestionObserver(DefaultFragmentPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onStarted() {
        presenter.passShowLoading();
    }

    @Override
    public void onNext(JsonQuestionResponse value) {
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
