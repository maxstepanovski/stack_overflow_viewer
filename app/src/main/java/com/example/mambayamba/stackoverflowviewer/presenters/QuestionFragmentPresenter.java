package com.example.mambayamba.stackoverflowviewer.presenters;

import com.example.mambayamba.stackoverflowviewer.model.questionlist.average.Item;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.average.QuestionListResponse;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.average.QuestionListModel;
import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.QuestionModelInterface;
import com.example.mambayamba.stackoverflowviewer.viewinterface.DefaultFragmentView;

import java.util.List;

import rx.Observable;

/**
 * Created by mambayamba on 14.11.2016.
 */

/**
 * MVP Business-logic Presenter class for DefaultFragment
 */
public class QuestionFragmentPresenter implements QuestionModelInterface {
    final private DefaultFragmentView viewElement;
    final private QuestionListModel questionListModel;

    public QuestionFragmentPresenter(DefaultFragmentView viewElement){
        this.viewElement = viewElement;
        this.questionListModel = new QuestionListModel();
    }

    final public Observable<QuestionListResponse> initializeDefaultQuestions(){
        return questionListModel.getDefaultQuestions();
    }

    final public Observable<QuestionListResponse> initializeHotQuestions(){
        return questionListModel.getHotQuestions();
    }

    final public Observable<QuestionListResponse> initializeWeekQuestions() {
        return questionListModel.getWeekQuestions();
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
