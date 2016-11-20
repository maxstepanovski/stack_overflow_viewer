package com.example.mambayamba.stackoverflowviewer.model.question.average;

import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.QuestionModelInterface;
import com.example.mambayamba.stackoverflowviewer.rest.RestFactory;
import java.util.List;
import lombok.Data;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by mambayamba on 16.11.2016.
 */
@Data
public class QuestionModel {
    public static final String TAG = "happyQuestionModel";
    private List<Item> questions;
    private QuestionModelInterface presenter;

    public QuestionModel(QuestionModelInterface presenter){
        this.presenter = presenter;
    }

    public Observable<JsonQuestionResponse> getDefaultQuestions(){
        return RestFactory.getRestFactory()
                .loadDefaultQuestions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<JsonQuestionResponse> getHotQuestions(){
        return RestFactory.getRestFactory()
                .loadHotQuestions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Observable<JsonQuestionResponse> getWeekQuestions(){
        return RestFactory.getRestFactory()
                .loadWeekQuestions()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}



