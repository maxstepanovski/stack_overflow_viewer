package com.example.mambayamba.stackoverflowviewer.presenters;

import com.example.mambayamba.stackoverflowviewer.model.question.average.Item;
import com.example.mambayamba.stackoverflowviewer.model.question.average.JsonQuestionResponse;
import com.example.mambayamba.stackoverflowviewer.model.question.average.QuestionModel;
import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.QuestionModelInterface;
import com.example.mambayamba.stackoverflowviewer.viewinterface.DefaultFragmentView;

import java.util.List;

import rx.Observable;

/**
 * Created by mambayamba on 14.11.2016.
 */
public class DefaultFragmentPresenter implements QuestionModelInterface {
    private DefaultFragmentView viewElement;
    private QuestionModel questionModel;

    public DefaultFragmentPresenter(DefaultFragmentView viewElement){
        this.viewElement = viewElement;
        this.questionModel = new QuestionModel(this);
    }

    public Observable<JsonQuestionResponse> initializeDefaultQuestions(){
        return questionModel.getDefaultQuestions();
    }

    public Observable<JsonQuestionResponse> initializeHotQuestions(){
        return questionModel.getHotQuestions();
    }

    public Observable<JsonQuestionResponse> initializeWeekQuestions() {
        return questionModel.getWeekQuestions();
    }

    @Override
    public void passShowLoading() {
        viewElement.showLoading();
    }

    @Override
    public void passHideLoading() {
        viewElement.hideLoading();
    }

    @Override
    public void passShowError() {
        viewElement.hideLoading();
        viewElement.showError();
    }

    @Override
    public void passShowList(List<Item> questions) {
        viewElement.showList(questions);
    }

}
