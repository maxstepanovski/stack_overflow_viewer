package com.example.mambayamba.stackoverflowviewer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.mambayamba.stackoverflowviewer.model.questionpage.Item;
import com.example.mambayamba.stackoverflowviewer.presenters.QuestionPageActivityPresenter;
import com.example.mambayamba.stackoverflowviewer.rest.QuestionPageObserver;
import com.example.mambayamba.stackoverflowviewer.screen.DownloadDialog;
import com.example.mambayamba.stackoverflowviewer.utility.Utility;
import com.example.mambayamba.stackoverflowviewer.viewinterface.QuestionPageActivityView;
import com.squareup.picasso.Picasso;

import org.apmem.tools.layouts.FlowLayout;

import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
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
    private static final int MAIN_PAGE = 0;
    private QuestionPageActivityPresenter presenter;
    private DownloadDialog downloadDialog;
    private RxLoader rxLoader;
    private RxLoaderManager loaderManager;
    private String questionId;

    @BindView(R.id.question_page_title)TextView questionPageTitle;
    @BindView(R.id.question_page_body)TextView questionPageBody;
    @BindView(R.id.question_score)TextView questionScore;
    @BindView(R.id.question_favourited)TextView questionFavourited;
    @BindView(R.id.question_asked)TextView questionAsked;
    @BindView(R.id.question_viewed)TextView questionViewed;
    @BindView(R.id.question_active)TextView questionActive;
    @BindView(R.id.question_page_user_avatar)ImageView userAvatar;
    @BindView(R.id.question_page_user_name)TextView userName;
    @BindView(R.id.question_page_user_score)TextView userScore;
    @BindView(R.id.gold_badges_count)TextView goldBadges;
    @BindView(R.id.silver_badges_count)TextView silverBadges;
    @BindView(R.id.bronze_badges_count)TextView bronzeBadges;
    @BindView(R.id.question_page_tag_layout)FlowLayout tagLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);
        ButterKnife.bind(this);

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
        Item page = pages.get(MAIN_PAGE);

        questionPageTitle.setText(page.getTitle().toString());
        questionPageBody.setText(page.getBody().toString());
        questionScore.setText(page.getScore().toString());
        questionFavourited.setText(page.getFavoriteCount().toString());
        questionAsked.setText(Utility.convertUnixTime(page.getCreationDate()));
        questionViewed.setText(page.getViewCount().toString());
        questionActive.setText(Utility.convertUnixTime(page.getLastActivityDate()));

        for(String tag: page.getTags()){
            TextView tagName = new TextView(this);
            tagName.setText(tag.toString());
            tagName.setBackgroundColor(this.getResources().getColor(R.color.tagBackground));
            tagName.setPadding(10,0,10,5);
            tagName.setTextColor(this.getResources().getColor(R.color.textColor));

            FlowLayout.LayoutParams layoutParams = new FlowLayout.LayoutParams(
                    FlowLayout.LayoutParams.WRAP_CONTENT,
                    FlowLayout.LayoutParams.WRAP_CONTENT
            );
            layoutParams.setMargins(
                    10,5,10,15
            );

            tagLayout.addView(tagName, layoutParams);
        }



        Picasso.with(this)
                .load(page.getOwner().getProfileImage())
                .into(userAvatar);
        userName.setText(page.getOwner().getDisplayName().toString());
        userScore.setText(page.getOwner().getReputation().toString());
        String gold = page.getOwner().getBadgeCounts().getGold().toString();
        String silver = page.getOwner().getBadgeCounts().getSilver().toString();
        String bronze = page.getOwner().getBadgeCounts().getBronze().toString();
        goldBadges.setText(gold == null? "0" : gold);
        silverBadges.setText(silver == null? "0" : silver);
        bronzeBadges.setText(bronze == null? "0" : bronze);
    }

}
