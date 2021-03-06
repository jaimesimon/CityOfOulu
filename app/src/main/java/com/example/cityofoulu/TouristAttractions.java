package com.example.cityofoulu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cityofoulu.ui.touristattractions.TouristAttractionsFragment;

public class TouristAttractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourist_attractions_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TouristAttractionsFragment.newInstance())
                    .commitNow();
        }
    }
}
