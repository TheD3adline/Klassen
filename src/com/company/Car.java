package com.company;

public class Car {

    //Attribute/Eigenschaften
    private String color; //Farbe
    private String brand; //Marke
    private int horsePower; //PS-Zahl

    //Methoden
    public void drive() {
        System.out.println("Das Auto faehrt...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
