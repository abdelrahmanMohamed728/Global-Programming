package com.example.abdo.globalprogramming;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if (i==0)
        {
            return new FirstTaskFragment();
        }
        else
            return new SecondTaskFragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
}

