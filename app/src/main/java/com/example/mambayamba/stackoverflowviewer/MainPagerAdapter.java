package com.example.mambayamba.stackoverflowviewer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mambayamba on 13.11.2016.
 */
public class MainPagerAdapter extends FragmentPagerAdapter{


    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new DefaultFragment();
            case 1:
                return new DefaultFragment();
            case 2:
                return new DefaultFragment();
            case 3:
                return new DefaultFragment();
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
        return String.valueOf(position);
    }
}
