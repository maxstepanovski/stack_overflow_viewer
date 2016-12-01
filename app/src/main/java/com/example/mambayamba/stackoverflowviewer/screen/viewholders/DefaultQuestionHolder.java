package com.example.mambayamba.stackoverflowviewer.screen.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.mambayamba.stackoverflowviewer.R;

import org.apmem.tools.layouts.FlowLayout;

import lombok.Data;

/**
 * Created by mambayamba on 16.11.2016.
 */

@Data
public class DefaultQuestionHolder extends RecyclerView.ViewHolder {
    private TextView questionTitle;
    private TextView votesCount;
    private TextView answersCount;
    private TextView viewsCount;
    private TextView userName;
    private FlowLayout tagLayout;

    public DefaultQuestionHolder(View view) {
        super(view);
        questionTitle = (TextView)view.findViewById(R.id.question_title);
        votesCount = (TextView)view.findViewById(R.id.votes_count);
        answersCount = (TextView)view.findViewById(R.id.answers_count);
        viewsCount = (TextView)view.findViewById(R.id.views_count);
        userName = (TextView)view.findViewById(R.id.last_activity_user_name);
        tagLayout = (FlowLayout)view.findViewById(R.id.default_tag_layout);
    }
}
