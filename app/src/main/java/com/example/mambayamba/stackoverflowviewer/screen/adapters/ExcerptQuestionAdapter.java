package com.example.mambayamba.stackoverflowviewer.screen.adapters;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mambayamba.stackoverflowviewer.R;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt.Item;
import com.example.mambayamba.stackoverflowviewer.screen.OnQuestionTitleClickListener;
import com.example.mambayamba.stackoverflowviewer.screen.OnTagClickListener;
import com.example.mambayamba.stackoverflowviewer.screen.viewholders.ExcerptQuestionHolder;

import org.apache.commons.lang.StringEscapeUtils;
import org.apmem.tools.layouts.FlowLayout;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by mambayamba on 20.11.2016.
 */
public class ExcerptQuestionAdapter extends RecyclerView.Adapter<ExcerptQuestionHolder> {
    private static final String TAG = "happyExcerptAdapter";
    private List<Item> questions;
    private WeakReference<AppCompatActivity> activity;

    public ExcerptQuestionAdapter(List<Item> questions, AppCompatActivity activity) {
        this.questions = questions;
        this.activity = new WeakReference<AppCompatActivity>(activity);
    }

    @Override
    public ExcerptQuestionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(activity.get());
        View view = inflater.inflate(R.layout.holder_excerpt_question, parent, false);
        return new ExcerptQuestionHolder(view);
    }

    @Override
    public void onBindViewHolder(ExcerptQuestionHolder holder, int position) {
        Item question = questions.get(position);
        holder.getQuestionTitle().setText(
                StringEscapeUtils.unescapeHtml(question.getTitle().toString()));
        holder.getQuestionTitle().setOnClickListener(
                new OnQuestionTitleClickListener(activity.get(), question.getQuestionId().toString()));
        holder.getVotesCount().setText(question.getScore().toString());
        holder.getAnswersCount().setText(String.valueOf(question.getAnswerCount()));
        holder.getViewsCount().setText(question.getQuestionScore().toString());
        holder.getUserName().setText(question.getOwner().getDisplayName().toString());

        List<String> tags = question.getTags();
        for(String tag: tags){
            TextView tagName = new TextView(activity.get());
            tagName.setText(tag.toString());
            tagName.setBackgroundColor(activity.get().getResources().getColor(R.color.tagBackground));
            tagName.setPadding(10,0,10,5);
            tagName.setTextColor(activity.get().getResources().getColor(R.color.textColor));
            tagName.setOnClickListener(new OnTagClickListener(activity.get(), tag.toString()));

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
