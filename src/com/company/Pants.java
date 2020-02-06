package com.company;

public class Pants {
    private String material;
    private String color;

    public Pants(String material, String color){
        this.material = material;
        this.color = color;
    }
    public void printPants(){
        System.out.println("Color: " + getColor());
        System.out.println("Material: " + getMaterial());
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
