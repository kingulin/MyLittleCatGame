package com.example.mylittlecat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Kitchen extends AppCompatActivity {

    public ImageView catMood;
    public ImageView Mood;
    public int catMoodNum = 100;
    public ImageView Clean;
    public boolean IsCatClean ;
    public static int CatClean;
    public ImageView Hungry;
    public static int CatHungry;
    public ImageView Sleep;
    public int CatSleep ;
    public int money ;
    public String moneyShow;
    public TextView moneyShowFinal;
    public boolean ISActive = true;

    public ImageView ArrR;
    public ImageView ArrL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);
        ArrR = findViewById(R.id.arrright);
        ArrL = findViewById(R.id.arrleft);

        ArrR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setContentView(R.layout.activity_bathroom);
                Intent intent = new Intent(Kitchen.this, Plaingroom.class);
                intent.putExtra("catMoodNum_key", catMoodNum);
                intent.putExtra("IsCatClean_key", IsCatClean);
                intent.putExtra("CatClean_key", CatClean);
                intent.putExtra("CatHungry_key", CatHungry);
                intent.putExtra("CatSleep_key", CatSleep);
                intent.putExtra("money_key", money);
                startActivity(intent);

            }
        });

                ArrL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Kitchen.this, Bathroom.class);
                intent.putExtra("catMoodNum_key", catMoodNum);
                intent.putExtra("IsCatClean_key", IsCatClean);
                intent.putExtra("CatClean_key", CatClean);
                intent.putExtra("CatHungry_key", CatHungry);
                intent.putExtra("CatSleep_key", CatSleep);
                intent.putExtra("money_key", money);
                startActivity(intent);
            }
        });

    }}