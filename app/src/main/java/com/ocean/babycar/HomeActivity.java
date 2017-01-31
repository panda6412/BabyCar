package com.ocean.babycar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*ImageView iv_babyCar_reservation = (ImageView)findViewById(R.id.iv_babyCar_reservation);
        TextView tv_babyCar_reservation = (TextView)findViewById(R.id.tv_babyCar_reservation);
        iv_babyCar_reservation.setOnClickListener(new onClicks());
        tv_babyCar_reservation.setOnClickListener(new onClicks());*/
    }
    class onClicks implements OnClickListener{

        @Override
        public void onClick(View v) {

            Toast.makeText(HomeActivity.this,"ImageView is Clicked !!",Toast.LENGTH_LONG).show();
        }
    }
}
