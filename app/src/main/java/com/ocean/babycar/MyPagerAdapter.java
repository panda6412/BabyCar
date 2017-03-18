package com.ocean.babycar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by liuyouyang on 2017/3/6.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments ;

    public MyPagerAdapter(FragmentManager fm , List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments ;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
