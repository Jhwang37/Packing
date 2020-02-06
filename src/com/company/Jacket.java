package com.company;

public class Jacket {
    private String color;
    private String material;
    public Jacket(String material, String color){
        this.material = material;
        this.color = color;
    }
    public void printJacket(){
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
