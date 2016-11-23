package com.example.mambayamba.stackoverflowviewer.presenters.presenterinterface;

/**
 * Created by mambayamba on 20.11.2016.
 */

/**
 * Base Interface, used for Presenter - Model interaction.
 * all the methods below are common to all the presenters
 Parent to:
 ExcerptModelInterface,
 FeaturedModelInterface,
 QuestionModelInterface
 */
public interface ModelInterface {
    public void passShowLoading();
    public void passHideLoading();
    public void passShowError();
}
