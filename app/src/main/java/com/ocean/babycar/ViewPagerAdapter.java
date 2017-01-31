package com.ocean.babycar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ocean.babycar.four_fragment.AirportFragment;
import com.ocean.babycar.four_fragment.BabyCarFragment;
import com.ocean.babycar.four_fragment.HomeFragment;
import com.ocean.babycar.four_fragment.TravelFragment;

/**
 * Created by liuyouyang on 2017/1/26.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created

    int [] drawableResId = {android.R.drawable.ic_btn_speak_now,android.R.drawable.ic_delete,android.R.drawable.ic_input_add,android.R.drawable.ic_dialog_map};
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);
        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0) // if the position is 0 we are returning the First tab
        {
            HomeFragment homeFragment = new HomeFragment();
            return homeFragment;
        }
        else if(position==1)          // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            BabyCarFragment babyCarFragment = new BabyCarFragment();
            return babyCarFragment;
        }
        else if(position==2)
        {
            AirportFragment airportFragment = new AirportFragment();
            return airportFragment;
        }
        else
        {
            TravelFragment travelFragment = new TravelFragment();
            return travelFragment;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return Titles[position];
    }

    public int[] getDrawable(){
        return drawableResId;
    }

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
