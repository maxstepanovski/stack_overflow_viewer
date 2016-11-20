package com.example.mambayamba.stackoverflowviewer.rest;

import android.util.Log;

import com.example.mambayamba.stackoverflowviewer.model.question.excerpt.Item;
import com.example.mambayamba.stackoverflowviewer.model.question.excerpt.JsonExcerptResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.ExcerptActivityPresenter;

import java.util.List;

import me.tatarka.rxloader.RxLoaderObserver;

/**
 * Created by mambayamba on 20.11.2016.
 */
public class ExcerptQuestionObserver extends RxLoaderObserver<JsonExcerptResponse> {
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
    public void onNext(JsonExcerptResponse value) {
        List<Item> questions = value.getItems();
//        for(Item item:questions)
//            Log.d(TAG, item.getTitle().toString()+", "+item.getExcerpt().toString()+", "+item.getOwner().getDisplayName().toString());
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
