package com.company;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Closet {
    private String material;
    private String color;
    private int howMany;
    private Jacket jacket;
    private Shirt shirt;
    private Pants pants;
    private Footwear footwear;

    ArrayList<Closet> jacketList = new ArrayList<Closet>(){{
        jacketList.add(new Closet("Linen", "Black"));
        jacketList.add(new Closet("Polyester", "Blue"));
        jacketList.add(new Closet("Jean", "White"));
    }};
    ArrayList<Shirt> shirtList = new ArrayList<Shirt>(){{
        shirtList.add(new Shirt("Blue", "Cotton"));
        shirtList.add(new Shirt("Purple", "Linen"));
        shirtList.add(new Shirt("Black", "Licra"));
    }};
    ArrayList<Pants> pantList = new ArrayList<Pants>(){{
        pantList.add(new Pants("Brown", "Cargo"));
        pantList.add(new Pants("Blue", "Jean"));
        pantList.add(new Pants("Black", "Legging"));
    }};
    ArrayList<Footwear> footwearList = new ArrayList<Footwear>(){{
        footwearList.add(new Footwear("Black", "Nike"));
        footwearList.add(new Footwear("White", "Adidas"));
        footwearList.add(new Footwear("Yellow", "Sandals"));
    }};
    public Closet(){
        chooseShirt();
    }

    public Closet(String material, String color){


    }
    public void chooseShirt(){
        System.out.println("Which shirt would you like: ");
        System.out.println(jacketList);

    }
//    public void print(ArrayList<Closet> clothes){
//        for(Closet x : clothes){
//            System.out.println(x);
//        }
//
//    }


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

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }
}
