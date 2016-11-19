package com.example.mambayamba.stackoverflowviewer.presenters;

import com.example.mambayamba.stackoverflowviewer.model.question.featured.FeaturedModel;
import com.example.mambayamba.stackoverflowviewer.model.question.featured.Item;
import com.example.mambayamba.stackoverflowviewer.model.question.featured.JsonFeaturedResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.FeaturedModelInterface;
import com.example.mambayamba.stackoverflowviewer.viewinterface.FeaturedFragmentView;

import java.util.List;

import rx.Observable;

/**
 * Created by mambayamba on 19.11.2016.
 */
public class FeaturedFragmentPresenter implements FeaturedModelInterface{
    private FeaturedFragmentView viewElement;
    private FeaturedModel questionModel;

    public FeaturedFragmentPresenter(FeaturedFragmentView viewElement){
        this.viewElement = viewElement;
        this.questionModel = new FeaturedModel(this);
    }

    public Observable<JsonFeaturedResponse> initializeFeaturedQuestions(){
        return questionModel.getFeaturedQuestions();
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
