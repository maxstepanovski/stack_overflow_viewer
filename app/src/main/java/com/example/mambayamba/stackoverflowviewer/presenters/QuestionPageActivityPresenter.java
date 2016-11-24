package com.example.mambayamba.stackoverflowviewer.presenters;

import com.example.mambayamba.stackoverflowviewer.model.questionpage.Item;
import com.example.mambayamba.stackoverflowviewer.model.questionpage.QuestionPageModel;
import com.example.mambayamba.stackoverflowviewer.model.questionpage.QuestionPageResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface.QuestionPageModelInterface;
import com.example.mambayamba.stackoverflowviewer.viewinterface.QuestionPageActivityView;

import java.util.List;

import rx.Observable;

/**
 * Created by mambayamba on 23.11.2016.
 *
 * MVP business-logic Presenter used within QuestionPageActivity
 */
public class QuestionPageActivityPresenter implements QuestionPageModelInterface {
    private static final String TAG = "happyQuestPagePresenter";
    final private QuestionPageModel questionPageModel;
    final private QuestionPageActivityView viewElement;

    public QuestionPageActivityPresenter(QuestionPageActivityView viewElement) {
        this.viewElement = viewElement;
        this.questionPageModel = new QuestionPageModel();
    }

    final public Observable<QuestionPageResponse> initializeQuestionPage(String questionId){
        return questionPageModel.getQuestionPage(questionId);
    }

    @Override
    public void passShowPage(List<Item> pages) {
        viewElement.showList(pages);
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
