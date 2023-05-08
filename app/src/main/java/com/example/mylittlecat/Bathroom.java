package com.example.mylittlecat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Bathroom extends AppCompatActivity{

    private ImageView Shower;
    private ImageView Soap;
    private ImageView Bubbles;
    private ImageView ArrL2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathroom);
//clean cat
        Shower = findViewById(R.id.shower);
        Soap = findViewById(R.id.soap);
        Bubbles = findViewById(R.id.bubbles);

        Soap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bubbles.setAlpha((float) 1);
            }
        });
        Shower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bubbles.setAlpha((float) 0);
                //CatClean = 100;
            }
        });
//set cats mood
//
//        catMood.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(catMoodNum <99){
//                    catMoodNum +=2;
//                }
//                if(catMoodNum > 50){
//                    if(IsCatClean){
//                        catMood.setImageResource(R.drawable.cat_tap);
//                    }else{
//
//                        catMood.setImageResource(R.drawable.cat_happy_dirty_tap);
//                    }
//                }}
//        });
//
//        //set stats change
//        final android.os.Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                if (CatHungry > 0) CatHungry -= 1.5;
//                if (CatSleep > 0 && !IsSleep) CatSleep -= 2;
//                else if(CatSleep <= 100 && IsSleep) CatSleep +=5;
//                if (CatClean > 0) CatClean -= 5;
//                if (catMoodNum > 0) {
//                    catMoodNum -= 2;
//                    if (CatClean <= 50) {
//                        catMoodNum -= 1;
//                    }
//                    if (CatSleep <= 30) {
//                        catMoodNum -= 2;
//                    }
//                    if (CatHungry <= 50) {
//                        catMoodNum -= 5;
//                    }
//                }
//
//                if(!IsSleep) {
//                    if (CatClean > 50 && catMoodNum > 50) {
//                        IsCatClean = true;
//                        catMood.setImageResource(R.drawable.cat);
//                    } else if (CatClean > 50 && catMoodNum <= 50) {
//                        IsCatClean = true;
//                        catMood.setImageResource(R.drawable.cat_sad);
//                    } else if (CatClean <= 50 && catMoodNum > 50) {
//                        IsCatClean = false;
//                        catMood.setImageResource(R.drawable.cat_happy_dirty);
//                    } else if (CatClean <= 50 && catMoodNum <= 50) {
//
//                        IsCatClean = false;
//                        catMood.setImageResource(R.drawable.cat_sad_dirty);
//                    }}
//                //ico changes
//                if (CatClean >= 50) {
//                    Clean.setImageResource(R.drawable.clean_full);
//                } else if (CatClean >= 20) {
//                    Clean.setImageResource(R.drawable.clean_half);
//                } else if (CatClean >= 1) {
//                    Clean.setImageResource(R.drawable.clean_alittle);
//                } else {
//                    Clean.setImageResource(R.drawable.clean_none);
//                }
//
//                if (catMoodNum >= 50) {
//                    Mood.setImageResource(R.drawable.mood_full);
//                } else if (catMoodNum >= 20) {
//                    Mood.setImageResource(R.drawable.mood_half);
//                } else if (catMoodNum >= 1) {
//                    Mood.setImageResource(R.drawable.mood_alittle);
//                } else {
//                    Mood.setImageResource(R.drawable.mood_none);
//                }
//
//                if (CatSleep >= 50) {
//                    Sleep.setImageResource(R.drawable.sleep_full);
//                } else if (CatSleep >= 20) {
//                    Sleep.setImageResource(R.drawable.sleep_half);
//                } else if (CatSleep >= 1) {
//                    Sleep.setImageResource(R.drawable.sleep_alittle);
//                } else {
//                    Sleep.setImageResource(R.drawable.sleep_none);
//                }
//
//                if (CatHungry >= 50) {
//                    Hungry.setImageResource(R.drawable.hungry_full);
//                } else if (CatHungry >= 20) {
//                    Hungry.setImageResource(R.drawable.hungry_half);
//                } else if (CatHungry >= 1) {
//                    Hungry.setImageResource(R.drawable.hungry_alittle);
//                } else {
//                    Hungry.setImageResource(R.drawable.hungry_none);
//                }
//
//                handler.postDelayed(this, 2*1000);
//
//            }
//        },2*1000);
//
//
//        // sets money
//
//        moneyShow = getString(R.string.money_status);
//
//        moneyShow = String.format(moneyShow, money);
//
//        moneyShowFinal = findViewById(R.id.money_status_id);
//        moneyShowFinal.setText(moneyShow);
//
//
//
//        //switch layout
//
//        ArrR = findViewById(R.id.arrright2);
       ArrL2 = findViewById(R.id.arrleft2);
//
////        ArrR.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                setContentView(R.layout.bathroom);
////            }
////        });

        ArrL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });
    }



}
