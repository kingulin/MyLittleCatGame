package com.example.mylittlecat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Plaingroom extends AppCompatActivity {
    public ImageView Shower;
    public ImageView Soap;
    public int CatClean;
    public ImageView Bubbles;
    private ImageView ArrL;
    private ImageView ArrR;
    private boolean IsCatClean;
    private boolean ISActive;
    public ImageView catMood;
    public ImageView Mood;
    public int catMoodNum;
    public ImageView Clean;
    public ImageView Hungry;
    public static int CatHungry;
    public ImageView Sleep;
    public static int CatSleep;
    public int money;
    public String moneyShow;
    public TextView moneyShowFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plaingroom);



        ArrR = findViewById(R.id.arrright);
        ArrL = findViewById(R.id.arrleft);

        ArrR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setContentView(R.layout.activity_bathroom);
                Intent intent = new Intent(Plaingroom.this, MainActivity.class);
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

                Intent intent = new Intent(Plaingroom.this, Kitchen.class);
                intent.putExtra("catMoodNum_key", catMoodNum);
                intent.putExtra("IsCatClean_key", IsCatClean);
                intent.putExtra("CatClean_key", CatClean);
                intent.putExtra("CatHungry_key", CatHungry);
                intent.putExtra("CatSleep_key", CatSleep);
                intent.putExtra("money_key", money);
                startActivity(intent);
            }
        });
    }
}