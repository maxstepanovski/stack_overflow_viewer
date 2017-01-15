package com.example.mambayamba.stackoverflowviewer.screen;

import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.util.Log;
import android.view.View;

import com.example.mambayamba.stackoverflowviewer.QuestionPageActivity;

/**
 * Created by mambayamba on 23.11.2016.
 *
 * as you can imagine from class name, every time you need to
 * set a ClickListener for a Question title, you use this one! :)
 */
public class OnQuestionTitleClickListener implements View.OnClickListener{
    private static final String QUESTION_ID = "questionId";
    private static final String TAG = "happyClickListener";
    final private Context context;
    final private String questionId;

    public OnQuestionTitleClickListener(Context context, String questionId) {
        this.context = context;
        this.questionId = questionId;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context , QuestionPageActivity.class);
        intent.putExtra(QUESTION_ID, questionId);
        context.startActivity(intent);
    }
}
