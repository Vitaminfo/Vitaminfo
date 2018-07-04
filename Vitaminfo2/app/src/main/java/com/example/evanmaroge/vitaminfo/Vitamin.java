package com.example.evanmaroge.vitaminfo;

public class Vitamin {

    private int id;
    private String name;

    private String letterName;

    public Vitamin(int id, String name, String letterName) {
        this.id = id;
        this.name = name;
        this.letterName = letterName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLetterName() {
        return letterName;
    }



    public String[] getFoodsThatContainVitamin(Vitamin vitamin){
        String[] foods = FoodsThatContainVitamin_Data.getVitaminsFood();
        String [] foodsThatContainVitamin = getFoodsFromStringArray(foods, vitamin.getId());
        return foodsThatContainVitamin;
    }
    //helper method that uses String split method to retrieve specific food from an array passed into it.
    private String[]getFoodsFromStringArray(String[] array, int id){
        String [] arrayOfSpecificFoodVitamin = array[id].split(", ", 10);

        return arrayOfSpecificFoodVitamin;
    }
}
