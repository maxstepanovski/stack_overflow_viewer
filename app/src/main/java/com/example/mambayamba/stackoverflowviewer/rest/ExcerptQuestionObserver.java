package com.example.mambayamba.stackoverflowviewer.rest;

import com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt.Item;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt.ExcerptQuestionListResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.ExcerptActivityPresenter;

import java.util.List;

import me.tatarka.rxloader.RxLoaderObserver;

/**
 * Created by mambayamba on 20.11.2016.
 */
public class ExcerptQuestionObserver extends RxLoaderObserver<ExcerptQuestionListResponse> {
    private static final String TAG = "happyExcerptObserver";
    private ExcerptActivityPresenter presenter;

    public ExcerptQuestionObserver(ExcerptActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onStarted() {
        presenter.passShowLoading();
    }

    @Override
    public void onNext(ExcerptQuestionListResponse value) {
        List<Item> questions = value.getItems();
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
