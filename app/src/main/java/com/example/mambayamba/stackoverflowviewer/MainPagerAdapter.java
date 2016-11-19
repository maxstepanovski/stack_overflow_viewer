package com.example.mambayamba.stackoverflowviewer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mambayamba on 13.11.2016.
 */
public class MainPagerAdapter extends FragmentPagerAdapter{
    String[] titles = {
            "Relevant",
            "Featured",
            "Hottest",
            "Week"
    };


    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new DefaultFragment();
            case 1:
                return new FeaturedFragment();
            case 2:
                return new HotFragment();
            case 3:
                return new WeekFragment();
            default:
                return new DefaultFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
