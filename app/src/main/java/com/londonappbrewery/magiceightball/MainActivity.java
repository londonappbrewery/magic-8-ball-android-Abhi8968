package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        Button askbutton = findViewById(R.id.Askbutton);
        final int[] ballArray = new int[]{
                R.mipmap.ball1,
                R.mipmap.ball2,
                R.mipmap.ball3,
                R.mipmap.ball4,
                R.mipmap.ball5
        };
        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random num = new Random();
                int n = num.nextInt(5);
                Log.d("Fortune","Your fortune is : " + n);
                ballDisplay.setImageResource(ballArray[n]);

            }
        });

    }
}
