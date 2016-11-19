package com.example.mambayamba.stackoverflowviewer.model.question.featured;

import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.FeaturedModelInterface;
import com.example.mambayamba.stackoverflowviewer.rest.RestFactory;

import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by mambayamba on 19.11.2016.
 */
public class FeaturedModel {
    public static final String TAG = "happyQuestionModel";
    private List<Item> questions;
    private FeaturedModelInterface presenter;

    public FeaturedModel(FeaturedModelInterface presenter){
        this.presenter = presenter;
    }

    public Observable<JsonFeaturedResponse> getFeaturedQuestions(){
        return RestFactory.getRestFactory()
                .loadFeaturedQuestions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
