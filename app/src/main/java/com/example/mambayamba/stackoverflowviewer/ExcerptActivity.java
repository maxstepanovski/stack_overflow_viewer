package com.example.mambayamba.stackoverflowviewer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.mambayamba.stackoverflowviewer.model.question.excerpt.Item;
import com.example.mambayamba.stackoverflowviewer.model.question.excerpt.JsonExcerptResponse;
import com.example.mambayamba.stackoverflowviewer.presenters.ExcerptActivityPresenter;
import com.example.mambayamba.stackoverflowviewer.rest.ExcerptQuestionObserver;
import com.example.mambayamba.stackoverflowviewer.screen.DownloadDialog;
import com.example.mambayamba.stackoverflowviewer.screen.adapters.ExcerptQuestionAdapter;
import com.example.mambayamba.stackoverflowviewer.viewinterface.ExcerptActivityView;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import me.tatarka.rxloader.RxLoader;
import me.tatarka.rxloader.RxLoader1;
import me.tatarka.rxloader.RxLoaderManager;
import me.tatarka.rxloader.RxLoaderManagerCompat;
import me.tatarka.rxloader.RxLoaderObserver;
import rx.Observable;
import rx.functions.Func1;

/**
 * Created by mambayamba on 20.11.2016.
 */
public class ExcerptActivity extends AppCompatActivity implements ExcerptActivityView, SearchView.OnQueryTextListener {
    private static final String TAG = "happyExcerptActivity";
    private DownloadDialog downloadDialog;
    private ExcerptActivityPresenter presenter;
    private ExcerptQuestionAdapter adapter;
    private RxLoaderManager loaderManager;
    private RxLoader1<String, JsonExcerptResponse> rxLoader;
    private String query;
    private SearchView searchView;
    @BindView(R.id.excerpt_recycler_view)RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excerpt);
        ButterKnife.bind(this);

        query = getIntent().getStringExtra(FragmentActivity.QUERY);

        downloadDialog = new DownloadDialog(this);
        presenter = new ExcerptActivityPresenter(this);
        loaderManager = RxLoaderManagerCompat.get(this);
        rxLoader = loaderManager.create(new Func1<String, Observable<JsonExcerptResponse>>() {
            @Override
            public Observable<JsonExcerptResponse> call(String s) {
                return presenter.initializeExcerptQuestions(s);
            }
        }, new ExcerptQuestionObserver(presenter) {
        }).start(query);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        MenuItem menuItem = menu.findItem(R.id.search);
        searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_refresh:{
                rxLoader.restart(query);
                break;
            }
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showList(List<Item> questions) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ExcerptQuestionAdapter(questions, this);
        recyclerView.setAdapter(adapter);
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
        Toast.makeText(this,
                getResources().getString(R.string.loading_error),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        rxLoader.restart(query);
        searchView.setIconified(true);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
