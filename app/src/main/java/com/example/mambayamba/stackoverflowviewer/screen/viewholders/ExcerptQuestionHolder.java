package com.example.mambayamba.stackoverflowviewer.screen.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.mambayamba.stackoverflowviewer.R;

/**
 * Created by mambayamba on 20.11.2016.
 */
public class ExcerptQuestionHolder extends RecyclerView.ViewHolder{
    public TextView questionTitle;
    public TextView excerptBodySnippet;
    public TextView votesCount;
    public TextView answersCount;
    public TextView viewsCount;
    public TextView userName;
    public TextView tagOne;
    public TextView tagTwo;
    public TextView tagThree;

    public ExcerptQuestionHolder(View view) {
        super(view);
        questionTitle = (TextView)view.findViewById(R.id.excerpt_question_title);
        excerptBodySnippet = (TextView)view.findViewById(R.id.excerpt_body_snippet);
        votesCount = (TextView)view.findViewById(R.id.excerpt_votes_count);
        answersCount = (TextView)view.findViewById(R.id.excerpt_answers_count);
        viewsCount = (TextView)view.findViewById(R.id.excerpt_views_count);
        userName = (TextView)view.findViewById(R.id.excerpt_last_activity_user_name);
        tagOne = (TextView)view.findViewById(R.id.excerpt_tag_one);
        tagTwo = (TextView)view.findViewById(R.id.excerpt_tag_two);
    }
}
