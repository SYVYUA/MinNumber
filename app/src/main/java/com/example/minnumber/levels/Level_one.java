package com.example.minnumber.levels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.minnumber.R;

import java.util.Random;

public class Level_one extends AppCompatActivity {

    private TextView num1ForLevel1, num2ForLevel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);

        num1ForLevel1 = findViewById(R.id.num1ForLevel1);
        num2ForLevel1 = findViewById(R.id.num2ForLevel1);

        Random random = new Random();
        int randForGame = random.nextInt(20);

    }
}
