package com.example.mylittlecat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Bathroom extends AppCompatActivity{

    private ImageView Shower;
    private ImageView Soap;
    private int CatClean;
    private ImageView Bubbles;
    private ImageView ArrL2;
    private ImageView ArrR2;
    private boolean IsCatClean;
    private boolean ISActive = true;
    private ImageView catMood;
    private ImageView Mood;
    private int catMoodNum = 100;
    private ImageView Clean;
    private ImageView Hungry;
    private static int CatHungry = 100;
    private ImageView Sleep;
    private static int CatSleep = 100;
    private int money = 0;
    private String moneyShow;
    private TextView moneyShowFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathroom);
//clean cat
        Shower = findViewById(R.id.shower);
        Soap = findViewById(R.id.soap);
        Bubbles = findViewById(R.id.bubbles);
        ArrL2 = findViewById(R.id.arrleft2);
        catMood = findViewById(R.id.catMood);
        Mood = findViewById(R.id.mood);
        Clean = findViewById(R.id.clean);
        Hungry = findViewById(R.id.hungry);
        Sleep = findViewById(R.id.sleep);
        ArrR2 = findViewById(R.id.arrright2);

        Intent takeintent = getIntent();
        IsCatClean = takeintent.getBooleanExtra("IsCatClean_key", true);
        CatClean = takeintent.getIntExtra("CatClean_key", 0);
        catMoodNum = takeintent.getIntExtra("catMoodNum_key", 0);
        CatHungry = takeintent.getIntExtra("CatHungry_key", 0);
        CatSleep = takeintent.getIntExtra("CatSleep_key", 0);
        money = takeintent.getIntExtra("money_key", 0);
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
                CatClean = 100;
            }
        });
        //        //switch layout
//

        ArrR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ISActive = false;
                Intent intent = new Intent(Bathroom.this, Kitchen.class);
                intent.putExtra("catMoodNum_key", catMoodNum);
                intent.putExtra("IsCatClean_key", IsCatClean);
                intent.putExtra("CatClean_key", CatClean);
                intent.putExtra("CatHungry_key", CatHungry);
                intent.putExtra("CatSleep_key", CatSleep);
                intent.putExtra("money_key", money);
                startActivity(intent);
            }
        });
        ArrL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ISActive = false;
                Intent intent = new Intent(Bathroom.this, MainActivity.class);
                intent.putExtra("catMoodNum_key", catMoodNum);
                intent.putExtra("IsCatClean_key", IsCatClean);
                intent.putExtra("CatClean_key", CatClean);
                intent.putExtra("CatHungry_key", CatHungry);
                intent.putExtra("CatSleep_key", CatSleep);
                intent.putExtra("money_key", money);
                startActivity(intent);
            }
        });



//set cats mood

        catMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(catMoodNum <99){
                    catMoodNum +=2;
                }
                if(catMoodNum > 50){
                    if(IsCatClean){
                        catMood.setImageResource(R.drawable.cat_tap);
                    }else{

                        catMood.setImageResource(R.drawable.cat_happy_dirty_tap);
                    }
                }}
        });
//
        if(ISActive){
//        //set stats change
            final android.os.Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (CatHungry > 0) CatHungry -= 1.5;
                    if (CatSleep > 0 ) CatSleep -= 2;
                    if (CatClean > 0) CatClean -= 5;
                    if (catMoodNum > 0) {
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

                    if (CatClean > 50 && catMoodNum > 50) {
                        IsCatClean = true;
                        catMood.setImageResource(R.drawable.cat);
                    } else if (CatClean > 50 && catMoodNum <= 50) {
                        IsCatClean = true;
                        catMood.setImageResource(R.drawable.cat_sad);
                    } else if (CatClean <= 50 && catMoodNum > 50) {
                        IsCatClean = false;
                        catMood.setImageResource(R.drawable.cat_happy_dirty);
                    } else if (CatClean <= 50 && catMoodNum <= 50) {

                        IsCatClean = false;
                        catMood.setImageResource(R.drawable.cat_sad_dirty);
                    }
                    //ico changes
                    if (CatClean >= 50) {
                        Clean.setImageResource(R.drawable.clean_full);
                    } else if (CatClean >= 20) {
                        Clean.setImageResource(R.drawable.clean_half);
                    } else if (CatClean >= 1) {
                        Clean.setImageResource(R.drawable.clean_alittle);
                    } else {
                        Clean.setImageResource(R.drawable.clean_none);
                    }

                    if (catMoodNum >= 50) {
                        Mood.setImageResource(R.drawable.mood_full);
                    } else if (catMoodNum >= 20) {
                        Mood.setImageResource(R.drawable.mood_half);
                    } else if (catMoodNum >= 1) {
                        Mood.setImageResource(R.drawable.mood_alittle);
                    } else {
                        Mood.setImageResource(R.drawable.mood_none);
                    }

                    if (CatSleep >= 50) {
                        Sleep.setImageResource(R.drawable.sleep_full);
                    } else if (CatSleep >= 20) {
                        Sleep.setImageResource(R.drawable.sleep_half);
                    } else if (CatSleep >= 1) {
                        Sleep.setImageResource(R.drawable.sleep_alittle);
                    } else {
                        Sleep.setImageResource(R.drawable.sleep_none);
                    }

                    if (CatHungry >= 50) {
                        Hungry.setImageResource(R.drawable.hungry_full);
                    } else if (CatHungry >= 20) {
                        Hungry.setImageResource(R.drawable.hungry_half);
                    } else if (CatHungry >= 1) {
                        Hungry.setImageResource(R.drawable.hungry_alittle);
                    } else {
                        Hungry.setImageResource(R.drawable.hungry_none);
                    }

                    handler.postDelayed(this, 2*1000);

                }
            },2*1000);}
        // sets money

        moneyShow = getString(R.string.money_status);

     //   moneyShow = "sleep" + CatSleep + ", shower" + CatClean + ", happy" + catMoodNum;
        moneyShow = String.format(moneyShow, money);

        moneyShowFinal = findViewById(R.id.money_status_id);
        moneyShowFinal.setText(moneyShow);
    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//        ISActive = true;
//    }
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        ISActive = false;
//    }


}
