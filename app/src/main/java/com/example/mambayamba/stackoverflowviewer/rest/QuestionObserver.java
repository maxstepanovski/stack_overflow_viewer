package com.example.mambayamba.stackoverflowviewer.rest;

import com.example.mambayamba.stackoverflowviewer.model.questionlist.average.Item;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.average.QuestionListResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.QuestionFragmentPresenter;

import java.util.List;

import me.tatarka.rxloader.RxLoaderObserver;

/**
 * Created by mambayamba on 16.11.2016.
 *
 * RxLoaderObserver class that observes data emitted by the QuestionListModel Observables,
 * returned by methods below:
 *
 * getDefaultQuestions()
 * getHotQuestions()
 * getWeekQuestions()
 */
public class QuestionObserver extends RxLoaderObserver<QuestionListResponse> {
    private QuestionFragmentPresenter presenter;

    public QuestionObserver(QuestionFragmentPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onStarted() {
        presenter.passShowLoading();
    }

    @Override
    public void onNext(QuestionListResponse value) {
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
