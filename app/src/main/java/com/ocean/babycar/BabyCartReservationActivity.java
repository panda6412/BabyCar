package com.ocean.babycar;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BabyCartReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_cart_reservation);

        initToolBar();
        initViewPager();
    }

    private void initToolBar() {
        Toolbar toolbar = (Toolbar)findViewById(R.id.id_toolbar);

        //Add toolbar
        setSupportActionBar(toolbar);
        TextView tv_toolbar_title = (TextView)toolbar.findViewById(R.id.tv_toolbar_title);

        //Hide ActionBar
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        tv_toolbar_title.setText("搭乘人數");
    }

    private void initViewPager(){
        List<Fragment> fragments = getFragments();
        PagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), fragments);
        ViewPager viewPager = (ViewPager)findViewById(R.id.vp_reservation);
        viewPager.setAdapter(adapter);

    }

    private List<Fragment> getFragments() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(PassengerFragment.newInstance("",""));
        fragments.add(LocationFragment.newInstance("",""));

        return fragments;
    }
}
