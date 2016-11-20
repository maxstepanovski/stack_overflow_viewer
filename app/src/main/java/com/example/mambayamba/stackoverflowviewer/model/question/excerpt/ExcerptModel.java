package com.example.mambayamba.stackoverflowviewer.model.question.excerpt;

import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.ExcerptModelInterface;
import com.example.mambayamba.stackoverflowviewer.rest.RestFactory;

import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by mambayamba on 20.11.2016.
 */
public class ExcerptModel {
    public static final String TAG = "happyExcerptModel";
    private List<Item> questions;
    private ExcerptModelInterface presenter;

    public ExcerptModel(ExcerptModelInterface presenter){
        this.presenter = presenter;
    }

    public Observable<JsonExcerptResponse> getExcerptQuestions(String query){
        return RestFactory.getRestFactory()
                .searchExcerpts(query)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
