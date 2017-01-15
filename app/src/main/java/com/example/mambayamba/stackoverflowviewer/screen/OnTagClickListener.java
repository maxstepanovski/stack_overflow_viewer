package com.example.mambayamba.stackoverflowviewer.screen;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.example.mambayamba.stackoverflowviewer.ExcerptActivity;
import com.example.mambayamba.stackoverflowviewer.FragmentActivity;

/**
 * Created by mambayamba on 01.12.2016.
 *
 * A click Listener for tags (obviously)
 */
public class OnTagClickListener implements View.OnClickListener{
    private Context context;
    private String query;

    public OnTagClickListener(Context context, String query) {
        this.context = context;
        this.query = query;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, ExcerptActivity.class);
        intent.putExtra(FragmentActivity.QUERY, query);
        context.startActivity(intent);
    }
}
