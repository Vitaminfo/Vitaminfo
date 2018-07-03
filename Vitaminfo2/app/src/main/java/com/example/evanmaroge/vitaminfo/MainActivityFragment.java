package com.example.evanmaroge.vitaminfo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Array;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private Button button;

    RecyclerView recyclerView;
    TextView t;

    VitaminAdapter vitaminAdapter;
    String[] vitamins = {"Vitamin A","Vitamin B","Vitamin C","Vitamin D","Vitamin E","Vitamin H","Vitamin K","Vitamin BV","Vitamin BVII","Vitamin BVI","Vitamin BIX","Vitamin BXII","Zinc"};
    String[] vitaminLetter = {"A","B","C","D","E","H","K","B5","B7","B6","B9","B12","Zinc"};

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


      //  button = view.findViewById(R.id.buttonDailyCalories);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v)
//            {
//                Intent intent = new Intent(getContext(),userinfo.class);
//                startActivity(intent);
//            }
//        }
        //);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        vitaminAdapter = new VitaminAdapter(getContext(),vitamins,vitaminLetter);
        recyclerView.setAdapter(vitaminAdapter);


       // button = view.findViewById(R.id.buttonDailyCalories);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v)
//            {
//                Intent intent = new Intent(getContext(),userinfo.class);
//                startActivity(intent);
//            }
//        });




      //  linearLayout0 = view.findViewById(R.id.layout0);
//        linearLayout0.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v)
//            {
//                Intent intent = new Intent(getContext(),foodActivity.class);
//                startActivity(intent);
//            }
//        });

        return view;
    }
}
