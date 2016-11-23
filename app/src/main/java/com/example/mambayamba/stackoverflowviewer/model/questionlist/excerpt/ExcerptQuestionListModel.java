package com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt;

import com.example.mambayamba.stackoverflowviewer.rest.RestFactory;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by mambayamba on 20.11.2016.
 */
public class ExcerptQuestionListModel {
    private static final String TAG = "happyExcerptModel";

    public ExcerptQuestionListModel(){}

    public Observable<ExcerptQuestionListResponse> getExcerptQuestions(String query){
        return RestFactory.getRestFactory()
                .searchExcerpts(query)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
