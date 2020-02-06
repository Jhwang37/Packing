package com.company;

public class Footwear {
    private String color;
    private String typeOfShoe;

    public Footwear(String color, String typeOfShoe){
        this.color = color;
        this.typeOfShoe = typeOfShoe;
    }
    public void printFootwear(){
        System.out.println("Color: " + getColor());
        System.out.println("Type of Shoe: " + getTypeOfShoe());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeOfShoe() {
        return typeOfShoe;
    }

    public void setTypeOfShoe(String typeOfShoe) {
        this.typeOfShoe = typeOfShoe;
    }
}
