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
//    @BindView(R.id.holder_title)TextView holderTitle;
    public TextView holderTitle;

    public SearchQuestionHolder(View view) {
        super(view);
//        ButterKnife.bind(this, view);
        holderTitle = (TextView)view.findViewById(R.id.holder_title);
    }
}
