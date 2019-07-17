package com.peter.andelachallenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

//        create back button in action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("My Profile");
        actionBar.setElevation(0);
    }
}
