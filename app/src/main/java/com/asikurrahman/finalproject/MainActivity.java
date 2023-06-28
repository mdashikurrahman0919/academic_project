package com.asikurrahman.finalproject;
import static com.asikurrahman.finalproject.R.layout.activity1_main;
import static com.asikurrahman.finalproject.R.layout.baozi01;
import static com.asikurrahman.finalproject.R.layout.duck01;
import static com.asikurrahman.finalproject.R.layout.kung_pao_chicken01;
import static com.asikurrahman.finalproject.R.layout.portrait;
import static com.asikurrahman.finalproject.R.layout.scroll1;
import static com.asikurrahman.finalproject.R.layout.scroll2;
import static com.asikurrahman.finalproject.R.layout.scroll3;
import static com.asikurrahman.finalproject.R.layout.scroll4;
import static com.asikurrahman.finalproject.R.layout.scroll5;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(portrait);


    }
    public void list_view(View v)
    {
        Intent intent= new Intent(MainActivity.this,list_view.class);
        startActivity(intent);
    }
    public void rating_view(View v)
    {
        Intent intent= new Intent(MainActivity.this,MainActivity1.class);
        startActivity(intent);
    }

    public void land(View view)
    {
        setContentView(scroll1);
    }
    public void first_food_list(View view)
    {
        setContentView(scroll2);
    }
    public void second_food_list(View view)
    {
        setContentView(scroll3);
    }
    public void third_food_list(View view)
    {
        setContentView(scroll4);
    }
    public void fourth_food_list(View view)
    {
        setContentView(scroll5);
    }
    public void last_food_list(View view)
    {
        setContentView(activity1_main);
    }



}