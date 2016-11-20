package com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface;

import com.example.mambayamba.stackoverflowviewer.model.question.average.Item;

import java.util.List;

/**
 * Created by mambayamba on 16.11.2016.
 */
public interface QuestionModelInterface extends ModelInterface{
    public void passShowList(List<Item> questions);
}
