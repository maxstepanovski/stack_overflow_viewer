package com.example.mambayamba.stackoverflowviewer.viewinterface;

import com.example.mambayamba.stackoverflowviewer.model.question.excerpt.Item;

import java.util.List;

/**
 * Created by mambayamba on 20.11.2016.
 */
public interface ExcerptFragmentView extends FragmentView {
    public void showList(List<Item> questions);
}
