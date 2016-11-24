package com.example.mambayamba.stackoverflowviewer.model.questionpage;

import com.example.mambayamba.stackoverflowviewer.rest.RestFactory;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by mambayamba on 21.11.2016.
 *
 * this class creates Observable<QuestionPageResponse> objects using RestFactory.
 * Allows QuestionPagePresenter to make api calls from within QuestionPageActivity.
 */
public class QuestionPageModel {
    private static final String TAG = "happyQuestPageModel";

    final public Observable<QuestionPageResponse> getQuestionPage(String questionId){
        return RestFactory.getRestFactory()
                .loadQuestionPage(questionId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
