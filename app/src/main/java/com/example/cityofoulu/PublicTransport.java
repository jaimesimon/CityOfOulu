package com.example.cityofoulu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cityofoulu.ui.publictransport.PublicTransportFragment;

public class PublicTransport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.public_transport_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, PublicTransportFragment.newInstance())
                    .commitNow();
        }
    }
}
