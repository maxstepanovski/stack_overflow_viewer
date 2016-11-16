package com.example.mambayamba.stackoverflowviewer.screen.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mambayamba.stackoverflowviewer.R;
import com.example.mambayamba.stackoverflowviewer.SearchFragment;
import com.example.mambayamba.stackoverflowviewer.model.Question.Item;
import com.example.mambayamba.stackoverflowviewer.screen.viewholders.SearchQuestionHolder;

import java.util.List;

/**
 * Created by mambayamba on 16.11.2016.
 */
public class SearchQuestionAdapter extends RecyclerView.Adapter<SearchQuestionHolder>{
    private static final String TAG = "happySearchAdapter";
    private List<Item> questions;
    private SearchFragment fragment;

    public SearchQuestionAdapter(List<Item> questions, SearchFragment fragment) {
        this.questions = questions;
        this.fragment = fragment;
    }

    @Override
    public SearchQuestionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(fragment.getActivity());
        View view = inflater.inflate(R.layout.holder_search_question, parent, false);
        return new SearchQuestionHolder(view);
    }

    @Override
    public void onBindViewHolder(SearchQuestionHolder holder, int position) {
        holder.holderTitle.setText(questions.get(position).getOwner().getDisplayName());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }
}
