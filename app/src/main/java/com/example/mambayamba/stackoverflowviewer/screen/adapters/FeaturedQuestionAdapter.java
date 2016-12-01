package com.example.mambayamba.stackoverflowviewer.screen.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mambayamba.stackoverflowviewer.FeaturedFragment;
import com.example.mambayamba.stackoverflowviewer.R;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.featured.Item;
import com.example.mambayamba.stackoverflowviewer.screen.OnQuestionTitleClickListener;
import com.example.mambayamba.stackoverflowviewer.screen.viewholders.FeaturedQuestionHolder;

import org.apmem.tools.layouts.FlowLayout;

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
        Item question = questions.get(position);
        holder.getQuestionTitle().setText(question.getTitle());
        holder.getQuestionTitle().setOnClickListener(
                new OnQuestionTitleClickListener(fragment.getActivity(), question.getQuestionId().toString()));
        holder.getVotesCount().setText(question.getScore().toString());
        holder.getAnswersCount().setText(question.getAnswerCount().toString());
        holder.getViewsCount().setText(question.getViewCount().toString());
        holder.getUserName().setText(question.getOwner().getDisplayName().toString());

        List<String> tags = question.getTags();
        for(String tag: tags){
            TextView tagName = new TextView(fragment.getActivity());
            tagName.setText(tag.toString());
            tagName.setBackgroundColor(fragment.getActivity().getResources().getColor(R.color.tagBackground));
            tagName.setPadding(10,0,10,5);
            tagName.setTextColor(fragment.getActivity().getResources().getColor(R.color.textColor));

            FlowLayout.LayoutParams layoutParams = new FlowLayout.LayoutParams(
                    FlowLayout.LayoutParams.WRAP_CONTENT,
                    FlowLayout.LayoutParams.WRAP_CONTENT
            );
            layoutParams.setMargins(
                    10,5,10,15
            );

            holder.getTagLayout().addView(tagName, layoutParams);
        }
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }
}
