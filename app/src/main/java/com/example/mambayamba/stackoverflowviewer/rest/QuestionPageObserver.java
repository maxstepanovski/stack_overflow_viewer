package com.example.mambayamba.stackoverflowviewer.rest;

import com.example.mambayamba.stackoverflowviewer.model.questionpage.QuestionPageResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.QuestionPageModelInterface;

import me.tatarka.rxloader.RxLoaderObserver;

/**
 * Created by mambayamba on 23.11.2016.
 */
public class QuestionPageObserver extends RxLoaderObserver<QuestionPageResponse> {
    private static final String TAG = "happyQuestPageObserver";
    private QuestionPageModelInterface presenter;

    public QuestionPageObserver(QuestionPageModelInterface presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onStarted() {
        presenter.passShowLoading();
    }

    @Override
    public void onNext(QuestionPageResponse value) {
        presenter.passShowPage(value.getItems());
    }

    @Override
    public void onCompleted() {
        presenter.passHideLoading();
    }

    @Override
    public void onError(Throwable e) {
        presenter.passHideLoading();
        presenter.passShowError();
    }
}
