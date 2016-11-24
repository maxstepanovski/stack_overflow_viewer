package com.example.mambayamba.stackoverflowviewer.screen.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mambayamba.stackoverflowviewer.FeaturedFragment;
import com.example.mambayamba.stackoverflowviewer.R;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.featured.Item;
import com.example.mambayamba.stackoverflowviewer.screen.OnQuestionTitleClickListener;
import com.example.mambayamba.stackoverflowviewer.screen.viewholders.FeaturedQuestionHolder;

import java.util.List;

/**
 * Created by mambayamba on 19.11.2016.
 */
public class FeaturedQuestionAdapter extends RecyclerView.Adapter<FeaturedQuestionHolder>{
    private static final String TAG = "happyFeaturedAdapter";
    private List<Item> questions;
    private FeaturedFragment fragment;

    public FeaturedQuestionAdapter(List<Item> questions, FeaturedFragment fragment) {
        this.questions = questions;
        this.fragment = fragment;
    }

    @Override
    public FeaturedQuestionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(fragment.getActivity());
        View view = inflater.inflate(R.layout.holder_featured_question, parent, false);
        return new FeaturedQuestionHolder(view);
    }

    @Override
    public void onBindViewHolder(FeaturedQuestionHolder holder, int position) {
        holder.questionTitle.setText(questions.get(position).getTitle());
        holder.questionTitle.setOnClickListener(
                new OnQuestionTitleClickListener(fragment.getActivity(), questions.get(position).getQuestionId().toString()));
        holder.votesCount.setText(questions.get(position).getScore().toString());
        holder.answersCount.setText(questions.get(position).getAnswerCount().toString());
        holder.viewsCount.setText(questions.get(position).getViewCount().toString());
        holder.userName.setText(questions.get(position).getOwner().getDisplayName().toString());
        if(questions.get(position).getTags().size() > 0 && !questions.get(position).getTags().get(0).isEmpty())
            holder.tagOne.setText(questions.get(position).getTags().get(0).toString());
        if(questions.get(position).getTags().size() > 1 && !questions.get(position).getTags().get(1).isEmpty())
            holder.tagTwo.setText(questions.get(position).getTags().get(1).toString());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }
}
