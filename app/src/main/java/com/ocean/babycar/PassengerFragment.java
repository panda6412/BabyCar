package com.ocean.babycar;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;



public class PassengerFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public int adult = 0 ;
    public int children = 0 ;
    public int luggage = 0 ;

    private View view ;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private EditText ed_adult;
    private EditText ed_children;
    private EditText ed_lagguage;
    private Button btn_adult_plus;
    private Button btn_adult_minus;
    private Button btn_children_plus;
    private Button btn_children_minus;
    private Button btn_lagguage_plus;
    private Button btn_lagguage_minus;

    public PassengerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PassengerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PassengerFragment newInstance(String param1, String param2) {
        PassengerFragment fragment = new PassengerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    private void btnSetOnClicks() {
        btn_adult_plus.setOnClickListener(new onClicks());
        btn_adult_minus.setOnClickListener(new onClicks());
        btn_children_plus.setOnClickListener(new onClicks());
        btn_children_minus.setOnClickListener(new onClicks());
        btn_lagguage_plus.setOnClickListener(new onClicks());
        btn_lagguage_minus.setOnClickListener(new onClicks());
    }

    private void findViewById() {

        ed_children = (EditText)view.findViewById(R.id.ed_children);
        ed_lagguage = (EditText)view.findViewById(R.id.ed_lagguage);
        btn_adult_plus = (Button)view.findViewById(R.id.btn_adult_plus);
        btn_adult_minus = (Button)view.findViewById(R.id.btn_adult_minus);
        btn_children_plus = (Button)view.findViewById(R.id.btn_children_plus);
        btn_children_minus = (Button)view.findViewById(R.id.btn_children_minus);
        btn_lagguage_plus = (Button)view.findViewById(R.id.btn_lagguage_plus);
        btn_lagguage_minus = (Button)view.findViewById(R.id.btn_lagguage_minus);
    }

    class onClicks implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            int id = v.getId();
            switch(id){
                case R.id.btn_adult_plus:
                    adult++;
                    ed_adult.setHint(adult);
                    break;
                case R.id.btn_adult_minus:
                    adult--;
                    ed_adult.setHint(adult);
                    break;
                case R.id.btn_children_plus:
                    children++;
                    ed_children.setHint(children);
                    break;
                case R.id.btn_children_minus:
                    children--;
                    ed_children.setHint(children);
                    break;
                case R.id.btn_lagguage_plus:
                    luggage++;
                    ed_lagguage.setHint(luggage);
                    break;
                case R.id.btn_lagguage_minus:
                    luggage--;
                    ed_lagguage.setHint(luggage);
                    break;
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_passenger, container, false);
        ed_adult = (EditText)view.findViewById(R.id.ed_adult);
        findViewById();
        btnSetOnClicks();
        // Inflate the layout for this fragment
        return view;
    }

}
