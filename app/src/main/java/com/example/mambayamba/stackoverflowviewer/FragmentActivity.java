package com.example.mambayamba.stackoverflowviewer;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mambayamba.stackoverflowviewer.viewinterface.DefaultFragmentView;
import com.example.mambayamba.stackoverflowviewer.viewinterface.FeaturedFragmentView;
import com.example.mambayamba.stackoverflowviewer.viewinterface.FragmentView;
import com.example.mambayamba.stackoverflowviewer.viewinterface.OnQueryPassed;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    public static final String COLON = ":";
    public static final String QUERY = "query";
    private static final String TAG = "happyFragmentActivity";
    public static final String ANDROID_SWITCHER = "android:switcher:";
    private SearchView searchView;
    @BindView(R.id.tab_layout)TabLayout tabLayout;
    @BindView(R.id.view_pager)ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        ButterKnife.bind(this);

        viewPager.setAdapter(new MainPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
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
                int itemNumber = viewPager.getCurrentItem();
                FragmentView currentFragment = (FragmentView)getSupportFragmentManager()
                        .findFragmentByTag(ANDROID_SWITCHER + R.id.view_pager + COLON + itemNumber);
                currentFragment.refresh();
                break;
            }
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Intent excerptActivityIntent = new Intent(this, ExcerptActivity.class);
        excerptActivityIntent.putExtra(QUERY, query);
        startActivity(excerptActivityIntent);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
