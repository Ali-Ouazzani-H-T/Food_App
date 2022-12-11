package com.example.my_restaurant_app.models;

public class DailyMealModel {

    int image;
    String name;
    String discount;
    String description;
    String Type;


    public DailyMealModel(int image, String name, String discount, String description , String type) {
        this.image = image;
        this.name = name;
        this.discount = discount;
        Type = type;
        this.description = description;
    }

    public DailyMealModel(int image, String name, String discount, String description) {
        this.image = image;
        this.name = name;
        this.discount = discount;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
