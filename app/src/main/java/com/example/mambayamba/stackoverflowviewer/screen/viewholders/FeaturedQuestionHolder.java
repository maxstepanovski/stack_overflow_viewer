package com.example.mambayamba.stackoverflowviewer.screen.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.mambayamba.stackoverflowviewer.R;

/**
 * Created by mambayamba on 19.11.2016.
 */
public class FeaturedQuestionHolder extends RecyclerView.ViewHolder{
    public TextView questionTitle;
    public TextView votesCount;
    public TextView answersCount;
    public TextView viewsCount;
    public TextView userName;
    public TextView tagOne;
    public TextView tagTwo;
    public TextView tagThree;

    public FeaturedQuestionHolder(View view) {
        super(view);
        questionTitle = (TextView)view.findViewById(R.id.featured_question_title);
        votesCount = (TextView)view.findViewById(R.id.featured_votes_count);
        answersCount = (TextView)view.findViewById(R.id.featured_answers_count);
        viewsCount = (TextView)view.findViewById(R.id.featured_views_count);
        userName = (TextView)view.findViewById(R.id.featured_last_activity_user_name);
        tagOne = (TextView)view.findViewById(R.id.featured_tag_one);
        tagTwo = (TextView)view.findViewById(R.id.featured_tag_two);
//        tagThree = (TextView)view.findViewById(R.id.featured_tag_three);
    }
}
