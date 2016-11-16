package com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface;

import com.example.mambayamba.stackoverflowviewer.model.Question.Item;

import java.util.List;

/**
 * Created by mambayamba on 16.11.2016.
 */
public interface QuestionModelInterface {
    public void passShowLoading();
    public void passHideLoading();
    public void passShowError();
    public void passShowList(List<Item> questions);
}
