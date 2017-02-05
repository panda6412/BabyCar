package com.ocean.babycar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    private static final int REQ_RESERVATION = 1;
    public Button btn_babycart_reservation;
    private Button btn_airport_carry;
    private Button btn_driver_login;
    private Button btn_record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findView();
        btn_babycart_reservation.setOnClickListener(new onClicks());
        btn_airport_carry.setOnClickListener(new onClicks());
        btn_driver_login.setOnClickListener(new onClicks());
        btn_record.setOnClickListener(new onClicks());


    }

    private void findView() {
        btn_babycart_reservation = (Button) findViewById(R.id.btn_babycart_reservation);
        btn_airport_carry = (Button) findViewById(R.id.btn_airport_carry);
        btn_driver_login = (Button) findViewById(R.id.btn_driver_login);
        btn_record = (Button) findViewById(R.id.btn_record);
    }

    class onClicks implements OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case  R.id.btn_babycart_reservation:
                    Toast.makeText(HomeActivity.this,v.getId()+"",Toast.LENGTH_LONG).show();

                    startActivityForResult(new Intent(HomeActivity.this,BabyCartReservationActivity.class),REQ_RESERVATION);
                    break;
                case  R.id.btn_airport_carry:
                    Toast.makeText(HomeActivity.this,v.getId()+"",Toast.LENGTH_LONG).show();
                    //startActivity();
                    break;
                case  R.id.btn_driver_login:
                    Toast.makeText(HomeActivity.this,v.getId()+"",Toast.LENGTH_LONG).show();

                    //startActivity();
                    break;
                case  R.id.btn_record:
                    Toast.makeText(HomeActivity.this,v.getId()+"",Toast.LENGTH_LONG).show();

                    //startActivity();
                    break;

            }
        }
    }
}
