package com.example.mambayamba.stackoverflowviewer.screen.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mambayamba.stackoverflowviewer.DefaultFragment;
import com.example.mambayamba.stackoverflowviewer.R;
import com.example.mambayamba.stackoverflowviewer.model.question.Item;
import com.example.mambayamba.stackoverflowviewer.screen.viewholders.DefaultQuestionHolder;

import java.util.List;

/**
 * Created by mambayamba on 16.11.2016.
 */
public class DefaultQuestionAdapter extends RecyclerView.Adapter<DefaultQuestionHolder>{
    private static final String TAG = "happyDefaultAdapter";
    private List<Item> questions;
    private DefaultFragment fragment;

    public DefaultQuestionAdapter(List<Item> questions, DefaultFragment fragment) {
        this.questions = questions;
        this.fragment = fragment;
    }

    @Override
    public DefaultQuestionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(fragment.getActivity());
        View view = inflater.inflate(R.layout.holder_default_question, parent, false);
        return new DefaultQuestionHolder(view);
    }

    @Override
    public void onBindViewHolder(DefaultQuestionHolder holder, int position) {
        holder.questionTitle.setText(questions.get(position).getTitle());
        holder.votesCount.setText(questions.get(position).getScore().toString());
        holder.answersCount.setText(questions.get(position).getAnswerCount().toString());
        holder.viewsCount.setText(questions.get(position).getViewCount().toString());
        holder.userName.setText(questions.get(position).getOwner().getDisplayName().toString());
        if(questions.get(position).getTags().size() > 0 && !questions.get(position).getTags().get(0).isEmpty())
            holder.tagOne.setText(questions.get(position).getTags().get(0).toString());
        if(questions.get(position).getTags().size() > 1 && !questions.get(position).getTags().get(1).isEmpty() )
            holder.tagTwo.setText(questions.get(position).getTags().get(1).toString());
//        if(questions.get(position).getTags().size() > 2 && !questions.get(position).getTags().get(2).isEmpty())
//            holder.tagThree.setText(questions.get(position).getTags().get(2).toString());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }
}
