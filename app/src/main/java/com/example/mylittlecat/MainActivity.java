package com.example.mylittlecat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public ImageView catMood;
    public boolean IsCatClean = true;
    public int CatClean = 40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catMood = findViewById(R.id.catMood);

        catMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if(IsCatClean == true){
             catMood.setImageResource(R.drawable.cat_tap);
            }else{

                 catMood.setImageResource(R.drawable.cat_happy_dirty_tap);
             }
            }
        });
        if(CatClean <= 50){
            IsCatClean = false;
            catMood.setImageResource(R.drawable.cat_happy_dirty);
        }

    }
}