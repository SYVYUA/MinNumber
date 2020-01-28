package com.example.minnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.minnumber.levels.Level_one;

public class MenuGame extends AppCompatActivity {

    private Button one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty, twenty_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id. three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);
        eleven = findViewById(R.id.eleven);
        twelve = findViewById(R.id.twelve);
        thirteen = findViewById(R.id.thirteen);
        fourteen = findViewById(R.id.fourteen);
        fifteen = findViewById(R.id.fifteen);
        sixteen = findViewById(R.id.sixteen);
        seventeen = findViewById(R.id.seventeen);
        eighteen = findViewById(R.id.eighteen);
        nineteen = findViewById(R.id.nineteen);
        twenty = findViewById(R.id.twenty);
        twenty_one = findViewById(R.id.twenty_one);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuGame.this, Level_one.class);
                startActivity(intent);
            }
        });

    }
}
