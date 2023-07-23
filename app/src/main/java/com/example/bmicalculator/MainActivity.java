package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editWeight,editHeightFt,editHeightInch;
        Button btnCalculate;
        TextView txtResult;
        LinearLayout llMain;

        editWeight = findViewById(R.id.editWeight);
        editHeightFt = findViewById(R.id.editHeightFT);
        editHeightInch = findViewById(R.id.editHeightINCH);
        btnCalculate = findViewById(R.id.btncalculate);
        txtResult = findViewById(R.id.txtResult);
        llMain = findViewById(R.id.llMain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int wt = Integer.parseInt(editWeight.getText().toString());
              int ft = Integer.parseInt(editHeightFt.getText().toString());
              int in = Integer.parseInt(editHeightInch.getText().toString());

              int totalinch = ft*12 + in;
              double totalcm = totalinch*2.53;
              double totalm = totalcm/100;
              double bmi = wt/(totalm*totalm);

              if (bmi>25){
                  txtResult.setText("You're Overweight");
                  llMain.setBackgroundColor(getResources().getColor(R.color.ow));
              } else if (bmi<18) {
                  txtResult.setText("You're UnderWeight");
                  llMain.setBackgroundColor(getResources().getColor(R.color.uw));
              } else {
                  txtResult.setText("You're Healthy");
                  llMain.setBackgroundColor(getResources().getColor(R.color.He));
              }

            }
        });





    }
}