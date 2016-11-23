package com.example.mambayamba.stackoverflowviewer.presenters;

import com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt.ExcerptQuestionListModel;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt.Item;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt.ExcerptQuestionListResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.ExcerptModelInterface;
import com.example.mambayamba.stackoverflowviewer.viewinterface.ExcerptActivityView;

import java.util.List;

import rx.Observable;

/**
 * Created by mambayamba on 20.11.2016.
 */

/**
 * MVP business-logic Presenter class for FeaturedFragment
 */
public class ExcerptActivityPresenter implements ExcerptModelInterface {
    private ExcerptActivityView viewElement;
    private ExcerptQuestionListModel questionModel;


    public ExcerptActivityPresenter(ExcerptActivityView viewElement) {
        this.viewElement = viewElement;
        this.questionModel = new ExcerptQuestionListModel();
    }

    final public Observable<ExcerptQuestionListResponse> initializeExcerptQuestions(String query){
        return questionModel.getExcerptQuestions(query);
    }

    @Override
    public void passShowList(List<Item> questions) {
        viewElement.showList(questions);
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
}
