package com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface;

import com.example.mambayamba.stackoverflowviewer.model.questionlist.featured.Item;

import java.util.List;

/**
 * Created by mambayamba on 19.11.2016.
 */
/**
 * used for FeaturedPresenter - FeaturedQuestionListModel interaction
 */
public interface FeaturedModelInterface extends ModelInterface{
    /**
     * @param questions
     * type: com.example.mambayamba.stackoverflowviewer.model.questionlist.featured.Item
     */
    public void passShowList(List<Item> questions);
}
