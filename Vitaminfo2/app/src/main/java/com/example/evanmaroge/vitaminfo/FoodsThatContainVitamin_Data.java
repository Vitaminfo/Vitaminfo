package com.example.evanmaroge.vitaminfo;

public abstract class FoodsThatContainVitamin_Data {


    /*
        Array that contains the corresponding food that contain it
        position 0: Vitamin A
        position 1: Vitamin B
        position 2: Vitamin C
        position 3: Vitamin D
        etc.
     */
    private static String[] vitaminFoods = {
            "Carrots, Spinach, Cantaloupe, Sweet Potato, Kale, Papaya, Lettuce, Tomato, Parsley, Mango", //A

            "Apricots, Apple, Banana, Blackberries, Grapefruit, Grapes, Kiwi, Lemon, Lime, Peach", //B

            "Kiwi, Green peppers, Orange, Strawberries, Broccoli, Kale, Parsley, Pineapple, Brussels Sprouts, Grapefruit",//C

            "Mushrooms, Cheese, Spinach, Eggs, Soy Milk, Salmon, Milk, Orange, Cereal, Blackberries",//D

            "Spinach, Kale, Parsley, Papaya, Broccoli, Almonds, Kiwi, Mango, Squash, Brussels Sprouts",//E

            "Eggs, Mushrooms, Raspberries, Salmon, Cheese, Avocado",//H

            "Kale, Spinach, Broccoli, Brussels Sprouts, Kiwi, Cheese, Avocado, Parsley",//K

            "Salmon, Eggs, Broccoli, Mushrooms, Avocado, Sweet Potato, Milk",//B5

            "Spinach, Sweet Potato, Strawberries, Raspberries, Banana",//B7

            "Milk, Cheese, Salmon, Carrots, Avocado",//B6

            "Broccoli, Avocado, Brussels Sprouts, Lettuce, Spinach",//B9

            "Salmon, Milk, Eggs, Cereal, Cheese",//B12

            "Avocado, Spinach, Cantaloupe, Broccoli, Mushrooms, Apricots"//Zinc




    };
    public static String[] getVitaminsFood(){
        return vitaminFoods;
    }
}
