package com.example.mambayamba.stackoverflowviewer.screen.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.mambayamba.stackoverflowviewer.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mambayamba on 16.11.2016.
 */
public class SearchQuestionHolder extends RecyclerView.ViewHolder {
    public TextView questionTitle;
    public TextView votesCount;
    public TextView answersCount;
    public TextView viewsCount;
    public TextView userName;
    public TextView tagOne;
    public TextView tagTwo;
    public TextView tagThree;

    public SearchQuestionHolder(View view) {
        super(view);
        questionTitle = (TextView)view.findViewById(R.id.question_title);
        votesCount = (TextView)view.findViewById(R.id.votes_count);
        answersCount = (TextView)view.findViewById(R.id.answers_count);
        viewsCount = (TextView)view.findViewById(R.id.views_count);
        userName = (TextView)view.findViewById(R.id.last_activity_user_name);
        tagOne = (TextView)view.findViewById(R.id.tag_one);
        tagTwo = (TextView)view.findViewById(R.id.tag_two);
        tagThree = (TextView)view.findViewById(R.id.tag_three);
    }
}
