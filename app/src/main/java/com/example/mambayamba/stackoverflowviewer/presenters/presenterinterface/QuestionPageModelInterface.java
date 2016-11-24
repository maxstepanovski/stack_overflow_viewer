package com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface;

import com.example.mambayamba.stackoverflowviewer.model.questionpage.Item;

import java.util.List;

/**
 * Created by mambayamba on 23.11.2016.
 *
 * This Interface is meant to be implemented by QuestionPageActivityPresenter
 * for it to be able to communicate with QuestionPageModel and receive
 * data from it.
 */
public interface QuestionPageModelInterface extends ModelInterface {
    public void passShowPage(List<Item> pages);
}
