package com.example.practical10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMeow = findViewById(R.id.BtnMeow);
        Button btnFindLockMap = findViewById(R.id.BtnFindLocMap);
        Button btnNearbyPlaces = findViewById(R.id.BtnNearbyPlaces);

        btnMeow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GetCurrentLocation.class);
                startActivity(intent);
            }
        });
        btnFindLockMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        btnNearbyPlaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FindNearbyPlaces.class);
                startActivity(intent);
            }
        });
    }

}