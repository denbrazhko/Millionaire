package com.dendev.millionaire.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 2;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                break;
            case 1:
                break;
                default:
                    return null;
        }


        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
