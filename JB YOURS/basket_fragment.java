package com.hello.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class basket_fragment extends Fragment {
    Activity context;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    Button gotoberlangsung, gotoselesai;
    ImageView gotoback;
    private String mParam1;
    private String mParam2;

    public basket_fragment() {
        // Required empty public constructor
    }

    public static basket_fragment newInstance(String param1, String param2) {
        basket_fragment fragment = new basket_fragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        View view = inflater.inflate(R.layout.fragment_basket_fragment, container, false);

        gotoberlangsung = view.findViewById(R.id.btn_berlangsung);
        gotoselesai = view.findViewById(R.id.btn_selesai);
        gotoback =view.findViewById(R.id.img_back);


        gotoberlangsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment secondFrag = new selesai_frag();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.container_basket_frag,secondFrag).commit();
            }
        });

        gotoselesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment selesaiFrag = new berlangsung_frag();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.container_basket_frag,selesaiFrag).commit();
            }
        });
        gotoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Beranda.class);
                startActivity(intent);
            }
        });


        return view;
    }
}