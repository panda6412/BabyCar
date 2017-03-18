package com.ocean.babycar;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ocean.babycar.Sliding_Tab.SlidingTabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"Home","BabyCar","Airport","Travel"};
    int Numboftabs =4;
    /*Drawable[] drawableResId = {getResources().getDrawable(android.R.drawable.ic_secure),
            getResources().getDrawable(android.R.drawable.ic_delete),
            getResources().getDrawable(android.R.drawable.ic_input_add),
            getResources().getDrawable(android.R.drawable.ic_dialog_map)};*/
    Integer [] drawableResIds = {android.R.drawable.ic_secure,android.R.drawable.ic_delete,android.R.drawable.ic_input_add,android.R.drawable.ic_dialog_map};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter =  new ViewPagerAdapter(getSupportFragmentManager(),Titles,Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setIconResourceArray(drawableResIds);
        tabs.setCustomTabView(R.layout.tab_row,0);

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);


    }
}
