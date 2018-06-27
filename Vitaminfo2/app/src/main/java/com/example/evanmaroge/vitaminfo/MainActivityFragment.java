package com.example.evanmaroge.vitaminfo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.lang.reflect.Array;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private Button button;
    String layout0 = "layout";
    private int[] linearLayoutNumber;
    private String[] linearLayoutNames;

    private LinearLayout[] layoutArray;

    private LinearLayout linearLayout0;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        button = view.findViewById(R.id.buttonDailyCalories);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent = new Intent(getContext(),userinfo.class);
                startActivity(intent);
            }
        });

        button = view.findViewById(R.id.buttonDailyCalories);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent = new Intent(getContext(),userinfo.class);
                startActivity(intent);
            }
        });




        linearLayout0 = view.findViewById(R.id.layout0);
        linearLayout0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent = new Intent(getContext(),foodActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
