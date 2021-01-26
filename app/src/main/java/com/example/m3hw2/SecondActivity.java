package com.example.m3hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {


    Button button;
    EditText number;



    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.button1);
        number = findViewById(R.id.number1);


     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String text = number.getText().toString();

             Intent intent = new Intent();
             intent.putExtra("bishkek", text);
             setResult(RESULT_OK, intent);
             finish();
         }
     });


    }
}