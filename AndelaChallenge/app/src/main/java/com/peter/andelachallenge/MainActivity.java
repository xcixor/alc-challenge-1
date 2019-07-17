package com.peter.andelachallenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        set the about alc button to open the andela homepage activity
        Button button_activity_b = (Button)findViewById(R.id.button_activity_b);
        button_activity_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ALCHomepage.class));
            }
        });

//        set action listener on the profile button to open the profile
        Button button_activity_c = (Button)findViewById(R.id.button_acivity_c);
        button_activity_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Profile.class));
            }
        });
    }
}
