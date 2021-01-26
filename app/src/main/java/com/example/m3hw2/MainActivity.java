package com.example.m3hw2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView camera;
    ImageView contacts;
    ImageView google;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        camera = findViewById(R.id.camera);
        contacts = findViewById(R.id.contacts);
        google = findViewById(R.id.google);
        button = findViewById(R.id.button);


      camera.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
              startActivity(intent);
          }
      });

         contacts.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(" tel : 949949494949" ));
              startActivity(intent);
             }
         });

      google.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent (Intent.ACTION_WEB_SEARCH);
           intent.putExtra(SearchManager.QUERY, "colesseum");
          startActivity(intent);
          }
      });

     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, SecondActivity.class);
             startActivityForResult(intent,202);
         }
     });








    }





}