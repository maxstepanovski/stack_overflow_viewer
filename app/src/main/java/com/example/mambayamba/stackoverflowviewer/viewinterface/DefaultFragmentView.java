package com.example.mambayamba.stackoverflowviewer.viewinterface;

import com.example.mambayamba.stackoverflowviewer.model.question.average.Item;

import java.util.List;

/**
 * Created by mambayamba on 14.11.2016.
 */
public interface DefaultFragmentView extends FragmentView {
    public void showList(List<Item> questions);
}
