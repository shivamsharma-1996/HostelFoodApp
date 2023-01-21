package com.hostelfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaySelectionActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMonday, btnTuesday, btnWednesday, btnThursday, btnFriday, btnSaturday, btnSunday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_selection);
        initViews();
        setup();
    }

    private void initViews() {
        btnMonday = findViewById(R.id.btn_monday);
        btnTuesday = findViewById(R.id.btn_tuesday);
        btnWednesday = findViewById(R.id.btn_wednesday);
        btnThursday = findViewById(R.id.btn_thursday);
        btnFriday = findViewById(R.id.btn_friday);
        btnSaturday = findViewById(R.id.btn_saturday);
        btnSunday = findViewById(R.id.btn_sunday);
    }

    private void setup() {
        btnMonday.setOnClickListener(this);
        btnTuesday.setOnClickListener(this);
        btnWednesday.setOnClickListener(this);
        btnThursday.setOnClickListener(this);
        btnFriday.setOnClickListener(this);
        btnSaturday.setOnClickListener(this);
        btnSunday.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        String selectedDay = null;
        switch (view.getId()) {
            case R.id.btn_monday:
                selectedDay = "Monday";
            break;
            case R.id.btn_tuesday:
                selectedDay = "Tuesday";
                break;
            case R.id.btn_wednesday:
                selectedDay = "Wednesday";
                break;
            case R.id.btn_thursday:
                selectedDay = "Thursday";
                break;
            case R.id.btn_friday:
                selectedDay = "Friday";
                break;
            case R.id.btn_saturday:
                selectedDay = "Saturday";
                break;
            case R.id.btn_sunday:
                selectedDay = "Sunday";
                break;
        }
        FoodTypeActivity.getStartIntent(DaySelectionActivity.this, selectedDay);
    }
}