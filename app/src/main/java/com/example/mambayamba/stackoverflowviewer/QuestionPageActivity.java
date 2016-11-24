package com.example.mambayamba.stackoverflowviewer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.mambayamba.stackoverflowviewer.model.questionpage.Item;
import com.example.mambayamba.stackoverflowviewer.presenters.QuestionPageActivityPresenter;
import com.example.mambayamba.stackoverflowviewer.rest.QuestionPageObserver;
import com.example.mambayamba.stackoverflowviewer.screen.DownloadDialog;
import com.example.mambayamba.stackoverflowviewer.viewinterface.QuestionPageActivityView;

import java.util.List;

import me.tatarka.rxloader.RxLoader;
import me.tatarka.rxloader.RxLoaderManager;
import me.tatarka.rxloader.RxLoaderManagerCompat;

/**
 * Created by mambayamba on 23.11.2016.
 *
 * Activity that displays a specific Question page as it is on StackOverflow.
 */
public class QuestionPageActivity extends AppCompatActivity implements QuestionPageActivityView {
    private static final String TAG = "happyQuestionPage";
    private static final String QUESTION_ID = "questionId";
    private QuestionPageActivityPresenter presenter;
    private DownloadDialog downloadDialog;
    private RxLoader rxLoader;
    private RxLoaderManager loaderManager;
    private String questionId;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);

        questionId = getIntent().getStringExtra(QUESTION_ID);
        downloadDialog = new DownloadDialog(this);
        presenter = new QuestionPageActivityPresenter(this);

        loaderManager = RxLoaderManagerCompat.get(this);
        rxLoader = loaderManager.create(
                presenter.initializeQuestionPage(questionId),
                new QuestionPageObserver(presenter)
        ).start();

    }

    @Override
    public void showLoading() {
        downloadDialog.show();
    }

    @Override
    public void hideLoading() {
        downloadDialog.cancel();
    }

    @Override
    public void showError() {
        downloadDialog.cancel();
        Toast.makeText(QuestionPageActivity.this, getResources().getString(R.string.loading_error), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showPage(List<Item> pages) {
        downloadDialog.cancel();

    }
}
