package com.example.mambayamba.stackoverflowviewer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mambayamba.stackoverflowviewer.model.Question.Item;
import com.example.mambayamba.stackoverflowviewer.model.Question.JsonQuestionResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.SearchFragmentPresenter;
import com.example.mambayamba.stackoverflowviewer.rest.DefaultQuestionObserver;
import com.example.mambayamba.stackoverflowviewer.screen.DownloadDialog;
import com.example.mambayamba.stackoverflowviewer.screen.adapters.SearchQuestionAdapter;
import com.example.mambayamba.stackoverflowviewer.viewinterface.SearchFragmentView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.tatarka.rxloader.RxLoader;
import me.tatarka.rxloader.RxLoaderManager;
import me.tatarka.rxloader.RxLoaderManagerCompat;


/**
 * Created by mambayamba on 13.11.2016.
 */
public class SearchFragment extends Fragment implements SearchFragmentView{
    private DownloadDialog downloadDialog;
    private SearchFragmentPresenter presenter;
    private SearchQuestionAdapter adapter;
    private RxLoaderManager loaderManager;
    private RxLoader<JsonQuestionResponse> rxLoader;
    @BindView(R.id.recyclerView)RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        ButterKnife.bind(this, view);

        downloadDialog = new DownloadDialog(getActivity());
        presenter = new SearchFragmentPresenter(this);

        loaderManager = RxLoaderManagerCompat.get(this);
        rxLoader = loaderManager.create(
                presenter.initializeDefaultQuestions(),
                new DefaultQuestionObserver(presenter)
        ).start();

        return view;
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
        Toast.makeText(getActivity(),
                getResources().getString(R.string.loading_error),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showList(List<Item> questions) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        adapter = new SearchQuestionAdapter(questions, this);
        recyclerView.setAdapter(adapter);
    }

}
