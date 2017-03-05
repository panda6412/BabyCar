package com.ocean.babycar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class BabyCartReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_cart_reservation);

        initToolBar();




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
}
