package com.example.mambayamba.stackoverflowviewer.model.questionlist.featured;

import com.example.mambayamba.stackoverflowviewer.rest.RestFactory;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by mambayamba on 19.11.2016.
 */
public class FeaturedQuestionListModel {
    private static final String TAG = "happyQuestionModel";

    public FeaturedQuestionListModel(){}

    final public Observable<FeaturedQuestionListResponse> getFeaturedQuestions(){
        return RestFactory.getRestFactory()
                .loadFeaturedQuestions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
