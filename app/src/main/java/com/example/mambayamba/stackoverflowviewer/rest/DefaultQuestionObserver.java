package com.example.mambayamba.stackoverflowviewer.rest;

import com.example.mambayamba.stackoverflowviewer.model.Question.Item;
import com.example.mambayamba.stackoverflowviewer.model.Question.JsonQuestionResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.SearchFragmentPresenter;

import java.util.List;

import me.tatarka.rxloader.RxLoaderObserver;
import rx.Observer;

/**
 * Created by mambayamba on 16.11.2016.
 */
public class DefaultQuestionObserver extends RxLoaderObserver<JsonQuestionResponse> {
    private SearchFragmentPresenter presenter;

    public DefaultQuestionObserver(SearchFragmentPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onStarted() {
//        presenter.passShowLoading();
    }

    @Override
    public void onNext(JsonQuestionResponse value) {
        List<Item> questions = value.getItems();
        presenter.passShowList(questions);
    }

    @Override
    public void onCompleted() {
//        presenter.passHideLoading();
    }

    @Override
    public void onError(Throwable e) {
        presenter.passShowError();
    }
}
