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
}
