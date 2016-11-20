package com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface;

import com.example.mambayamba.stackoverflowviewer.model.question.excerpt.Item;

import java.util.List;

/**
 * Created by mambayamba on 20.11.2016.
 */
public interface ExcerptModelInterface extends ModelInterface {
    public void passShowList(List<Item> questions);
}
