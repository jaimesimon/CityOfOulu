package com.example.cityofoulu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cityofoulu.ui.sports.SportsFragment;

public class Sports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, SportsFragment.newInstance())
                    .commitNow();
        }
    }
}
