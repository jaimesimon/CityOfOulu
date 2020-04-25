package com.example.cityofoulu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cityofoulu.ui.hotels.HotelsFragment;

public class Hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotels_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, HotelsFragment.newInstance())
                    .commitNow();
        }
    }
}
