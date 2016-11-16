package com.example.mambayamba.stackoverflowviewer.presenters;

import android.support.v4.widget.SwipeRefreshLayout;

import com.example.mambayamba.stackoverflowviewer.model.Question.Item;
import com.example.mambayamba.stackoverflowviewer.model.Question.JsonQuestionResponse;
import com.example.mambayamba.stackoverflowviewer.model.Question.QuestionModel;
import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.QuestionModelInterface;
import com.example.mambayamba.stackoverflowviewer.viewinterface.SearchFragmentView;

import java.util.List;

import rx.Observable;

/**
 * Created by mambayamba on 14.11.2016.
 */
public class SearchFragmentPresenter implements QuestionModelInterface {
    private SearchFragmentView viewElement;
    private QuestionModel questionModel;

    public SearchFragmentPresenter(SearchFragmentView viewElement){
        this.viewElement = viewElement;
        this.questionModel = new QuestionModel(this);
    }

    public Observable<JsonQuestionResponse> initializeDefaultQuestions(){
        return questionModel.getDefaultQuestions();
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
