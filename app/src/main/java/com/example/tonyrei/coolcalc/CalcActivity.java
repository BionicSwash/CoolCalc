package com.example.tonyrei.coolcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    public enum Operation {
        ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUALS
    }

    TextView resultTextView;

    String runningTotal ="";
    String rightValueStr = "";
    String leftValueStr = "";

    Operation currentOperation;

    int result = 0;



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

        resultTextView = (TextView) findViewById(R.id.resultTextView);

        resultTextView.setText("0");


        oneButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(1);
            }
        });

        twoButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(2);

            }
        });

        threeButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(3);

            }
        });

        fourButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(4);

            }
        });

        fiveButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(5);

            }
        });

        sixButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(6);

            }
        });

        sevenButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(7);

            }
        });

        eightButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(8);

            }
        });

        nineButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(9);

            }
        });

        zeroButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberPressed(0);

            }
        });

        clearButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftValueStr = "";
                rightValueStr = "";
                result = 0;
                runningTotal = "0";
                currentOperation = null;
                resultTextView.setText("0");

            }
        });

        equalsButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation(Operation.EQUALS);

            }
        });

        subtractButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation(Operation.SUBTRACT);

            }
        });

        addButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation(Operation.ADD);

            }
        });

        multiplyButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation(Operation.MULTIPLY);

            }
        });

        divideButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation(Operation.DIVIDE);

            }
        });

        resultTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

            }
        });}

    void processOperation(Operation operation) {
        if (currentOperation != null) {

            if (runningTotal != "") {
                rightValueStr = runningTotal;
                runningTotal = "";

                switch (currentOperation) {
                    case ADD:
                        result = Integer.parseInt(leftValueStr) + Integer.parseInt(rightValueStr);
                        break;
                    case SUBTRACT:
                        result = Integer.parseInt(leftValueStr) - Integer.parseInt(rightValueStr);
                        break;
                    case MULTIPLY:
                        result = Integer.parseInt(leftValueStr) * Integer.parseInt(rightValueStr);
                        break;
                    case DIVIDE:
                        result = Integer.parseInt(leftValueStr) / Integer.parseInt(rightValueStr);
                        break;
                }

                leftValueStr = String.valueOf(result);
                resultTextView.setText(leftValueStr);
            }


        } else {
            leftValueStr = runningTotal;
            runningTotal = "";
        }
        currentOperation = operation;
    }


        void numberPressed(int number) {
            runningTotal +=String.valueOf(number);
            resultTextView.setText(runningTotal);



    }
    }

