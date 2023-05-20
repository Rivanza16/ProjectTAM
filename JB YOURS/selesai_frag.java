package com.hello.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.net.CacheRequest;
import java.text.DateFormat;
import java.util.Calendar;


public class selesai_frag extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public selesai_frag() {
        // Required empty public constructor
    }


    public static selesai_frag newInstance(String param1, String param2) {
        selesai_frag fragment = new selesai_frag();
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
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_selesai_frag, container, false);

        Calendar calender = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calender.getTime());

        TextView textViewDate = root.findViewById(R.id.text_viewDate);
        textViewDate.setText(currentDate);
        return root;
    }
}