package com.company;

public class Shirt {
    private String color;
    private String material;

    public Shirt(String color, String material){
        this.color = color;
        this.material = material;
    }
    public void printShirt(){
        System.out.println("Color: " + getColor());
        System.out.println("Material: " + getMaterial());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
