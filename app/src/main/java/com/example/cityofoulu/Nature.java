package com.example.cityofoulu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cityofoulu.ui.nature.NatureFragment;

public class Nature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nature_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, NatureFragment.newInstance())
                    .commitNow();
        }
    }
}
