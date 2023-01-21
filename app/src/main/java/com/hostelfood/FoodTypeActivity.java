package com.hostelfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class FoodTypeActivity extends AppCompatActivity {

    public static final String EXTRAS_FOOD_TYPE = "food_type";

    public static void getStartIntent(Context context, String productId) {
        Intent intent = new Intent(context, FoodTypeActivity.class);
        intent.putExtra(EXTRAS_FOOD_TYPE, productId);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_type);
    }
}