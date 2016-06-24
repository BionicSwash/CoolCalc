package com.example.tonyrei.coolcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Button oneButn = (Button) findViewById(R.id.oneButn);
        Button twoButn = (Button) findViewById(R.id.twoButn);
        Button threeButn = (Button) findViewById(R.id.threeButn);
        Button fourButn = (Button) findViewById(R.id.fourButn);
        Button fiveButn = (Button) findViewById(R.id.fiveButn);
        Button sixButn = (Button) findViewById(R.id.sixbutn);
        Button sevenButn = (Button) findViewById(R.id.sevenButn);
        Button eightButn = (Button) findViewById(R.id.eightButn);
        Button nineButn = (Button) findViewById(R.id.nineButn);
        Button zeroButn = (Button) findViewById(R.id.zeroButn);
        Button clearButn = (Button) findViewById(R.id.clearButn);

        ImageButton equalsButn = (ImageButton) findViewById(R.id.equalsButn);
        ImageButton subtractButn = (ImageButton) findViewById(R.id.subtractButn);
        ImageButton addButn = (ImageButton) findViewById(R.id.addButn);
        ImageButton multiplyButn = (ImageButton) findViewById(R.id.multiplyButn);
        ImageButton divideButn = (ImageButton) findViewById(R.id.divideButn);

        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        oneButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        twoButn.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {

           }
        });

        threeButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        fourButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        fiveButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sixButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sevenButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        eightButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        nineButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        zeroButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        clearButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        equalsButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        subtractButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        addButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        multiplyButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        divideButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }}

