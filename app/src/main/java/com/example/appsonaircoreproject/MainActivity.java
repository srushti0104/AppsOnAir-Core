package com.example.appsonaircoreproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.appsonaircore.AppsOnAirCoreService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String appId = AppsOnAirCoreService.getAppId(this);
        Log.d("APP_ID", "Retrive App id: " + appId);
    }
}