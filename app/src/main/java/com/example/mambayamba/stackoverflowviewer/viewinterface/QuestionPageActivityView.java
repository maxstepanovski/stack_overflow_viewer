package com.example.mambayamba.stackoverflowviewer.viewinterface;

import com.example.mambayamba.stackoverflowviewer.model.questionpage.Item;

import java.util.List;

/**
 * Created by mambayamba on 23.11.2016.
 *
 * to be implemented by QuestionPageActivity
 * to communicate with QuestionPageActivityPresenter
 * and receive commands and data from it.
 */
public interface QuestionPageActivityView {
    public void showLoading();
    public void hideLoading();
    public void showError();
    public void showPage(List<Item> pages);
}
