package com.example.mambayamba.stackoverflowviewer.screen.adapters;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mambayamba.stackoverflowviewer.R;
import com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt.Item;
import com.example.mambayamba.stackoverflowviewer.screen.OnQuestionTitleClickListener;
import com.example.mambayamba.stackoverflowviewer.screen.viewholders.ExcerptQuestionHolder;

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
        holder.questionTitle.setText(questions.get(position).getTitle().toString());
        holder.questionTitle.setOnClickListener(
                new OnQuestionTitleClickListener(activity.get(), questions.get(position).getQuestionId().toString()));
        holder.excerptBodySnippet.setText(questions.get(position).getExcerpt().toString());
        holder.votesCount.setText(questions.get(position).getScore().toString());
        holder.answersCount.setText(String.valueOf(questions.get(position).getAnswerCount()));
        holder.viewsCount.setText(questions.get(position).getQuestionScore().toString());
        holder.userName.setText(questions.get(position).getOwner().getDisplayName().toString());
        if(questions.get(position).getTags().size() > 0 && !questions.get(position).getTags().get(0).isEmpty())
            holder.tagOne.setText(questions.get(position).getTags().get(0).toString());
        if(questions.get(position).getTags().size() > 1 && !questions.get(position).getTags().get(1).isEmpty() )
            holder.tagTwo.setText(questions.get(position).getTags().get(1).toString());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }
}
