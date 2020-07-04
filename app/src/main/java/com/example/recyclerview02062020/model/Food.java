package com.example.recyclerview02062020.model;

import com.example.recyclerview02062020.R;

import java.util.ArrayList;
import java.util.List;

public class Food {
    private Integer image;
    private String name;
    private String describe;
    private String price;

    // constructor (alt + insert)

    public Food(Integer image, String name, String describe, String price) {
        this.image = image;
        this.name = name;
        this.describe = describe;
        this.price = price;
    }
    // getter and setter


    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static void mock(List<Food> foods){
        foods.add(new Food(R.drawable.buncha ,"Bún chả","Bún chả hà nội ngon số một khu vực Hà Nội","45000"));
        foods.add(new Food(R.drawable.goicuon ,"Gỏi cuốn","Gỏi cuốn tôm thịt","30000"));
        foods.add(new Food(R.drawable.khaivi ,"Khai vị","Các món khai vị được dùng trong bữa tiệc","130000"));
        foods.add(new Food(R.drawable.tomchien ,"Tôm chiên","Tôm chiên giòn","50000"));
        foods.add(new Food(R.drawable.buncha ,"Tôm hùm","Tôm hùm tươi sống","150000"));
    }
}
