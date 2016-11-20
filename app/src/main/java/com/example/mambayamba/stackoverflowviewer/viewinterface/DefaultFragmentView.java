package com.example.mambayamba.stackoverflowviewer.viewinterface;

import com.example.mambayamba.stackoverflowviewer.model.question.Item;

import java.util.List;

/**
 * Created by mambayamba on 14.11.2016.
 */
public interface DefaultFragmentView extends FragmentView {
    public void showLoading();
    public void hideLoading();
    public void showError();
    public void showList(List<Item> questions);
    public void refresh();
}
