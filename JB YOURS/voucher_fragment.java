package com.hello.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class voucher_fragment extends Fragment {

    Activity context;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public voucher_fragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static voucher_fragment newInstance(String param1, String param2) {
        voucher_fragment fragment = new voucher_fragment();
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
        View root =inflater.inflate(R.layout.fragment_voucher_fragment, container, false);
        return root;
    }
    public  void  onStart(){
        super.onStart();
        ImageView gotoback = (ImageView) context.findViewById(R.id.backvou);

        gotoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Beranda.class);
                startActivity(intent);
            }
        });
    }
}