package com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface;

import com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt.Item;

import java.util.List;

/**
 * Created by mambayamba on 20.11.2016.
 */

/**
 * interface used for ExcerptActivityPresenter - ExcerptModel interaction
 */
public interface ExcerptModelInterface extends ModelInterface {
    /**
     *
     * @param questions type: com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt.Item
     */
    public void passShowList(List<Item> questions);
}
