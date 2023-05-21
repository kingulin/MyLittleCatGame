package com.example.mylittlecat;

import android.widget.ImageView;

public class FoodSpinner {
    private String foodName;
    private int foodImage;

    public FoodSpinner(String foodName, int foodImage){
        this.foodImage = foodImage;
        this.foodName = foodName;
    }


    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
