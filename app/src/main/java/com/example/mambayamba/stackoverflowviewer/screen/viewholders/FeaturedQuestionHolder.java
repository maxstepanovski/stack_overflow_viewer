package com.example.mambayamba.stackoverflowviewer.screen.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mambayamba.stackoverflowviewer.R;

import org.apmem.tools.layouts.FlowLayout;

import lombok.Data;

/**
 * Created by mambayamba on 19.11.2016.
 */

@Data
public class FeaturedQuestionHolder extends RecyclerView.ViewHolder{
    private TextView questionTitle;
    private TextView votesCount;
    private TextView answersCount;
    private TextView viewsCount;
    private TextView userName;
    private FlowLayout tagLayout;

    public FeaturedQuestionHolder(View view) {
        super(view);
        questionTitle = (TextView)view.findViewById(R.id.featured_question_title);
        votesCount = (TextView)view.findViewById(R.id.featured_votes_count);
        answersCount = (TextView)view.findViewById(R.id.featured_answers_count);
        viewsCount = (TextView)view.findViewById(R.id.featured_views_count);
        userName = (TextView)view.findViewById(R.id.featured_last_activity_user_name);
        tagLayout = (FlowLayout) view.findViewById(R.id.featured_tag_layout);
    }
}
