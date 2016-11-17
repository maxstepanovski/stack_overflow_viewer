package com.example.mambayamba.stackoverflowviewer.screen.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mambayamba.stackoverflowviewer.DefaultFragment;
import com.example.mambayamba.stackoverflowviewer.R;
import com.example.mambayamba.stackoverflowviewer.model.Question.Item;
import com.example.mambayamba.stackoverflowviewer.screen.viewholders.SearchQuestionHolder;

import java.util.List;

/**
 * Created by mambayamba on 16.11.2016.
 */
public class SearchQuestionAdapter extends RecyclerView.Adapter<SearchQuestionHolder>{
    private static final String TAG = "happySearchAdapter";
    private List<Item> questions;
    private DefaultFragment fragment;

    public SearchQuestionAdapter(List<Item> questions, DefaultFragment fragment) {
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
        holder.questionTitle.setText(questions.get(position).getTitle());
        Log.d(TAG, questions.get(position).toString());
        holder.votesCount.setText(questions.get(position).getScore().toString());
        holder.answersCount.setText(questions.get(position).getAnswerCount().toString());
        holder.viewsCount.setText(questions.get(position).getViewCount().toString());
        holder.userName.setText(questions.get(position).getOwner().getDisplayName().toString());
        if(questions.get(position).getTags().size() > 0 && !questions.get(position).getTags().get(0).isEmpty())
            holder.tagOne.setText(questions.get(position).getTags().get(0).toString());
        if(questions.get(position).getTags().size() > 1 && !questions.get(position).getTags().get(1).isEmpty() )
            holder.tagTwo.setText(questions.get(position).getTags().get(1).toString());
        if(questions.get(position).getTags().size() > 2 && !questions.get(position).getTags().get(2).isEmpty())
            holder.tagThree.setText(questions.get(position).getTags().get(2).toString());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }
}
