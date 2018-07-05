package com.example.evanmaroge.vitaminfo;

import java.util.HashMap;
import java.util.Map;

public class FoodNutritionInformation {

    private final int servingSize = 100;
    private Map<String, Integer> calories = new HashMap<String, Integer>();
    private Map<String, Integer> fat = new HashMap<String, Integer>();
    private Map<String, Integer> sodium = new HashMap<String, Integer>();
    private Map<String, Integer> carbohydrates = new HashMap<String, Integer>();
    private Map<String, Integer> protein = new HashMap<String, Integer>();




    public FoodNutritionInformation(){

        calories.put("Carrots",41);
        calories.put("Spinach",19);
        calories.put("Cantaloupe",34);
        calories.put("Sweet Potato",90);
        calories.put("Kale",51);
        calories.put("Papaya",39);
        calories.put("Lettuce",17);
        calories.put("Tomato",18);
        calories.put("Parsley",36);
        calories.put("Mango",58);
        calories.put("Avocado",167);
        calories.put("Apricots",48);
        calories.put("Banana",420);
        calories.put("Apple",160);
        calories.put("Blackberries",43);
        calories.put("Grapefruit",42);
        calories.put("Grapes",69);
        calories.put("Kiwi",61);
        calories.put("Lemon",29);
        calories.put("Lime",30);
        calories.put("Peach",39);
        calories.put("Green peppers",26);
        calories.put("Orange",47);
        calories.put("Strawberries",32);
        calories.put("Broccoli",34);
        calories.put("Pineapple",48);
        calories.put("Brussels Sprouts",43);
        calories.put("Mushrooms",22);
        calories.put("Cheese",403);
        calories.put("Eggs",147);
        calories.put("Soy Milk",54);
        calories.put("Salmon",146);
        calories.put("Milk",60);
        calories.put("Cereal",376);
        calories.put("Almonds",578);
        calories.put("Squash",45);
        calories.put("Raspberries",52);


        fat.put("Carrots",0);
        fat.put("Spinach",1);
        fat.put("Cantaloupe",0);
        fat.put("Sweet Potato",0);
        fat.put("Kale",1);
        fat.put("Papaya",0);
        fat.put("Lettuce",0);
        fat.put("Tomato",0);
        fat.put("Parsley",1);
        fat.put("Mango",1);
        fat.put("Avocado",15);
        fat.put("Apricots",0);
        fat.put("Banana",24);
        fat.put("Apple",2);
        fat.put("Blackberries",0);
        fat.put("Grapefruit",0);
        fat.put("Grapes",0);
        fat.put("Kiwi",1);
        fat.put("Lemon",0);
        fat.put("Lime",0);
        fat.put("Peach",0);
        fat.put("Green peppers",0);
        fat.put("Orange",0);
        fat.put("Strawberries",0);
        fat.put("Broccoli",0);
        fat.put("Pineapple",0);
        fat.put("Brussels Sprouts",0);
        fat.put("Mushrooms",0);
        fat.put("Cheese",33);
        fat.put("Eggs",10);
        fat.put("Soy Milk",2);
        fat.put("Salmon",6);
        fat.put("Milk",3);
        fat.put("Cereal",3);
        fat.put("Almonds",51);
        fat.put("Squash",0);
        fat.put("Raspberries",1);

        sodium.put("Carrots",69);
        sodium.put("Spinach",79);
        sodium.put("Cantaloupe",16);
        sodium.put("Sweet Potato",36);
        sodium.put("Kale",43);
        sodium.put("Papaya",3);
        sodium.put("Lettuce",8);
        sodium.put("Tomato",5);
        sodium.put("Parsley",56);
        sodium.put("Mango",5);
        sodium.put("Avocado",8);
        sodium.put("Apricots",1);
        sodium.put("Banana",236);
        sodium.put("Apple",300);
        sodium.put("Blackberries",1);
        sodium.put("Grapefruit",0);
        sodium.put("Grapes",2);
        sodium.put("Kiwi",3);
        sodium.put("Lemon",2);
        sodium.put("Lime",2);
        sodium.put("Peach",0);
        sodium.put("Green peppers",2);
        sodium.put("Orange",0);
        sodium.put("Strawberries",1);
        sodium.put("Broccoli",33);
        sodium.put("Pineapple",1);
        sodium.put("Brussels Sprouts",25);
        sodium.put("Mushrooms",5);
        sodium.put("Cheese",621);
        sodium.put("Eggs",140);
        sodium.put("Soy Milk",57);
        sodium.put("Salmon",46);
        sodium.put("Milk",40);
        sodium.put("Cereal",676);
        sodium.put("Almonds",1);
        sodium.put("Squash",4);
        sodium.put("Raspberries",1);

        carbohydrates.put("Carrots",10);
        carbohydrates.put("Spinach",1);
        carbohydrates.put("Cantaloupe",8);
        carbohydrates.put("Sweet Potato",21);
        carbohydrates.put("Kale",10);
        carbohydrates.put("Papaya",10);
        carbohydrates.put("Lettuce",3);
        carbohydrates.put("Tomato",4);
        carbohydrates.put("Parsley",6);
        carbohydrates.put("Mango",13);
        carbohydrates.put("Avocado",9);
        carbohydrates.put("Apricots",11);
        carbohydrates.put("Banana",30);
        carbohydrates.put("Apple",30);
        carbohydrates.put("Blackberries",10);
        carbohydrates.put("Grapefruit",11);
        carbohydrates.put("Grapes",18);
        carbohydrates.put("Kiwi",15);
        carbohydrates.put("Lemon",9);
        carbohydrates.put("Lime",11);
        carbohydrates.put("Peach",10);
        carbohydrates.put("Green peppers",6);
        carbohydrates.put("Orange",12);
        carbohydrates.put("Strawberries",8);
        carbohydrates.put("Broccoli",6);
        carbohydrates.put("Pineapple",13);
        carbohydrates.put("Brussels Sprouts",9);
        carbohydrates.put("Mushrooms",3);
        carbohydrates.put("Cheese",1);
        carbohydrates.put("Eggs",1);
        carbohydrates.put("Soy Milk",5);
        carbohydrates.put("Salmon",0);
        carbohydrates.put("Milk",5);
        carbohydrates.put("Cereal",83);
        carbohydrates.put("Almonds",20);
        carbohydrates.put("Squash",12);
        carbohydrates.put("Raspberries",12);

        protein.put("Carrots",1);
        protein.put("Spinach",3);
        protein.put("Cantaloupe",1);
        protein.put("Sweet Potato",2);
        protein.put("Kale",3);
        protein.put("Papaya",1);
        protein.put("Lettuce",1);
        protein.put("Tomato",1);
        protein.put("Parsley",3);
        protein.put("Mango",1);
        protein.put("Avocado",2);
        protein.put("Apricots",1);
        protein.put("Banana",21);
        protein.put("Apple",7);
        protein.put("Blackberries",1);
        protein.put("Grapefruit",1);
        protein.put("Grapes",1);
        protein.put("Kiwi",1);
        protein.put("Lemon",1);
        protein.put("Lime",1);
        protein.put("Peach",1);
        protein.put("Green peppers",1);
        protein.put("Orange",1);
        protein.put("Strawberries",1);
        protein.put("Broccoli",3);
        protein.put("Pineapple",1);
        protein.put("Brussels Sprouts",3);
        protein.put("Mushrooms",3);
        protein.put("Cheese",25);
        protein.put("Eggs",13);
        protein.put("Soy Milk",5);
        protein.put("Salmon",22);
        protein.put("Milk",3);
        protein.put("Cereal",7);
        protein.put("Almonds",21);
        protein.put("Squash",1);
        protein.put("Raspberries",1);

    }



    public int getServingSize(){
        return servingSize;
    }
    public int retrieveCalories(String foodName){
        Integer value = 0;
        value = calories.get(foodName);
        return value.intValue();
    }

    public int retrieveFat(String foodName){
        return fat.get(foodName);
    }
    public int retrieveSodium(String foodName){
        return sodium.get(foodName);
    }
    public int retrieveCarbohydrates(String foodName){
        return carbohydrates.get(foodName);
    }
    public int retrieveProtein(String foodName){
        return protein.get(foodName);
    }

}
