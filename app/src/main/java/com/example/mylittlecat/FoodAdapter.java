package com.example.mylittlecat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<FoodSpinner> {

    public FoodAdapter(Context context, ArrayList<FoodSpinner> foodList) {
        super(context, 0, foodList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.food_images, parent, false
            );
        }
        ImageView imageViewFood = convertView.findViewById(R.id.food_view_img);
        TextView textViewName = convertView.findViewById(R.id.text_view_names);

        FoodSpinner currentItem = getItem(position);

        if (currentItem != null) {
            imageViewFood.setImageResource(currentItem.getFoodImage());
            textViewName.setText(currentItem.getFoodName());
        }
        return convertView;
    }
}
