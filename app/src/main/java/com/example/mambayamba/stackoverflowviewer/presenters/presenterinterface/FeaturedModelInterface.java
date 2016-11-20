package com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface;

import com.example.mambayamba.stackoverflowviewer.model.question.featured.Item;

import java.util.List;

/**
 * Created by mambayamba on 19.11.2016.
 */
public interface FeaturedModelInterface extends ModelInterface{
    public void passShowList(List<Item> questions);
}
