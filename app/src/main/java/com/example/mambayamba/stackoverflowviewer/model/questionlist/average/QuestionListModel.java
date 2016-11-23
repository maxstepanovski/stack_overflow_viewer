package com.example.mambayamba.stackoverflowviewer.model.questionlist.average;

import com.example.mambayamba.stackoverflowviewer.rest.RestFactory;
import lombok.Data;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by mambayamba on 16.11.2016.
 */
@Data
public class QuestionListModel {
    private static final String TAG = "happyQuestionModel";

    public QuestionListModel(){}

    public Observable<QuestionListResponse> getDefaultQuestions(){
        return RestFactory.getRestFactory()
                .loadDefaultQuestions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<QuestionListResponse> getHotQuestions(){
        return RestFactory.getRestFactory()
                .loadHotQuestions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<QuestionListResponse> getWeekQuestions(){
        return RestFactory.getRestFactory()
                .loadWeekQuestions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}



