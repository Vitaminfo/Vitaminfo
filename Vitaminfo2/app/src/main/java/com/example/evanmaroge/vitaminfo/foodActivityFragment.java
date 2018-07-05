package com.example.evanmaroge.vitaminfo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;
import static android.content.Intent.getIntent;

/**
 * A placeholder fragment containing a simple view.
 */
public class FoodActivityFragment extends Fragment {




    private int vitaminId;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter recyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] foods;

    private int position;
    private String vitaminName;
    private String vitaminLetter;

    public FoodActivityFragment() {
    }
    //    public FoodActivityFragment() {
//        for (int i =0;i< s.length;i++){
//            Log.w(s[i], "none");
//        }
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_food, container, false);

        //Get vitamin id(position), vitamin letter, and vitamin name from previous activity
        position = getActivity().getIntent().getIntExtra("vitaminPosition",position);
        vitaminLetter = getActivity().getIntent().getStringExtra("vitaminLetter");
        vitaminName = getActivity().getIntent().getStringExtra("vitaminName");


        //takes the vitamin selected and retrieves a list of foods from the Food Nutrition class using the Vitamin class
        Vitamin vitaminSelected = new Vitamin(position,vitaminName,vitaminLetter);
        String[] vitaminSelectedFoods = vitaminSelected.getFoodsThatContainVitamin(vitaminSelected);


        recyclerView = fragmentView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
//
//        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        recyclerViewAdapter = new FoodAdapter(getContext(),vitaminSelectedFoods);
        recyclerView.setAdapter(recyclerViewAdapter);



        return fragmentView;
    }
}
