package com.example.mylittlecat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;

//import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    public ImageView catMood;
    public int catMoodNum = 100;
    public boolean IsCatClean = true;
    public static int CatClean = 100;
   public static int CatHungry = 100;
   public static int CatSleep = 100;
    public int money = 0;
    public String moneyShow;
    public TextView moneyShowFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//set cats mood

        catMood = findViewById(R.id.catMood);
        catMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catMoodNum +=2;
                if(catMoodNum > 50){
             if(IsCatClean == true){
             catMood.setImageResource(R.drawable.cat_tap);
            }else{

                 catMood.setImageResource(R.drawable.cat_happy_dirty_tap);
             }
            }}
        });

         //set stats change

        final Handler handler = new Handler();
     handler.postDelayed(new Runnable() {
         @Override
         public void run() {
             if(CatHungry > 0) CatHungry -=1;
             if(CatSleep > 0) CatSleep -=2;
             if(CatClean > 0) CatClean -= 5;
             if(catMoodNum > 0) {
                 catMoodNum -= 2;
                 if (CatClean <= 50) {
                     catMoodNum -= 1;
                 }
                 if (CatSleep <= 30) {
                     catMoodNum -= 2;
                 }
                 if (CatHungry <= 50) {
                     catMoodNum -= 5;
                 }
             }

             if(CatClean > 50 && catMoodNum > 50) {
                 IsCatClean = true;
                 catMood.setImageResource(R.drawable.cat);
             }
             else if(CatClean > 50 && catMoodNum <= 50) {
                 IsCatClean = true;
                 catMood.setImageResource(R.drawable.cat_sad);
             }
             else if(CatClean <= 50 && catMoodNum > 50) {
                 IsCatClean = false;
                 catMood.setImageResource(R.drawable.cat_happy_dirty);
             }else if(CatClean <= 50 && catMoodNum <= 50){

                 IsCatClean = false;
                 catMood.setImageResource(R.drawable.cat_sad_dirty);
             }

             handler.postDelayed(this, 2*1000);

         }
     },2*1000);
        // sets money

        moneyShow = getString(R.string.money_status);

        moneyShow = String.format(moneyShow, money);

        moneyShowFinal = findViewById(R.id.money_status_id);
        moneyShowFinal.setText(moneyShow);


            }
        }
