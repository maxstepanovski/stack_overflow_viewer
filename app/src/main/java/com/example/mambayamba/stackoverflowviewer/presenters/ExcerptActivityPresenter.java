package com.example.mambayamba.stackoverflowviewer.presenters;

import com.example.mambayamba.stackoverflowviewer.model.question.excerpt.ExcerptModel;
import com.example.mambayamba.stackoverflowviewer.model.question.excerpt.Item;
import com.example.mambayamba.stackoverflowviewer.model.question.excerpt.JsonExcerptResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.ExcerptModelInterface;
import com.example.mambayamba.stackoverflowviewer.viewinterface.ExcerptActivityView;

import java.util.List;

import rx.Observable;

/**
 * Created by mambayamba on 20.11.2016.
 */
public class ExcerptActivityPresenter implements ExcerptModelInterface {
    private ExcerptActivityView viewElement;
    private ExcerptModel questionModel;
    private String query;

    public ExcerptActivityPresenter(ExcerptActivityView viewElement) {
        this.viewElement = viewElement;
    }

    public Observable<JsonExcerptResponse> initializeExcerptQuestions(String query){
        questionModel = new ExcerptModel(this);
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
