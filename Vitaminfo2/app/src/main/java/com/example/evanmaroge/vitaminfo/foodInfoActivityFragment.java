package com.example.evanmaroge.vitaminfo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class FoodInfoActivityFragment extends Fragment {

    private TextView foodName;

    private TextView servingSizeAmount;

    private TextView caloriesAmount;

    private TextView fatAmount;

    private TextView sodiumAmount;

    private TextView carbohydratesAmount;

    private TextView proteinAmount;

    private String foodSelected;

    private FoodNutritionInformation nutritionInformation = new FoodNutritionInformation();


    public FoodInfoActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_food_info, container, false);

        foodName = (TextView) fragmentView.findViewById(R.id.foodName);
        servingSizeAmount = (TextView) fragmentView.findViewById(R.id.servingSizeAmount);
        caloriesAmount = (TextView) fragmentView.findViewById(R.id.caloriesAmount);
        fatAmount = (TextView) fragmentView.findViewById(R.id.fatAmount);
        sodiumAmount = (TextView) fragmentView.findViewById(R.id.sodiumAmount);
        carbohydratesAmount = (TextView) fragmentView.findViewById(R.id.carbohydratesAmount);
        proteinAmount = (TextView) fragmentView.findViewById(R.id.proteinAmount);


        foodSelected = getActivity().getIntent().getStringExtra("foodSelected");


        foodName.setText(foodSelected);
        servingSizeAmount.setText(nutritionInformation.getServingSize() + " grams");
        caloriesAmount.setText(nutritionInformation.retrieveCalories(foodSelected) + " mg");
        fatAmount.setText(nutritionInformation.retrieveFat(foodSelected) + " mg");
        sodiumAmount.setText(nutritionInformation.retrieveSodium(foodSelected) + " mg");
        carbohydratesAmount.setText(nutritionInformation.retrieveCarbohydrates(foodSelected)+ " mg");
        proteinAmount.setText(nutritionInformation.retrieveProtein(foodSelected) + " mg");


        return fragmentView;
    }
}
