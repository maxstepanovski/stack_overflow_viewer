package com.example.mambayamba.stackoverflowviewer.rest;

import android.util.Log;

import com.example.mambayamba.stackoverflowviewer.model.Question.Item;
import com.example.mambayamba.stackoverflowviewer.model.Question.JsonQuestionResponse;
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
            Log.d("happy", item.getTitle()+" "+item.getAnswerCount()+" "+item.getTags().toString()+" "+item.getViewCount()+"\n");
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
