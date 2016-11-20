package com.example.mambayamba.stackoverflowviewer;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
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

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    public static final int DEFAULT_FRAGMENT = 0;
    private static final String TAG = "happyFragmentActivity";
    public static final String ANDROID_SWITCHER = "android:switcher:";
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
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_refresh:{
                int itemNumber = viewPager.getCurrentItem();
                FragmentView currentFragment = (FragmentView)getSupportFragmentManager()
                        .findFragmentByTag(ANDROID_SWITCHER + R.id.view_pager + ":" + itemNumber);
                currentFragment.refresh();
            }
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        viewPager.setCurrentItem(DEFAULT_FRAGMENT);

        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
