package com.example.cityofoulu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;


import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class BotanicalGarden extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap gMap;
    SupportMapFragment mapFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botanical_garden);

        mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.botanical_gardens_fragment);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;
        LatLng coordinates = new LatLng(65.0628874,25.4630701);
        gMap.addMarker(new MarkerOptions().position(coordinates).title("Botanical Gardens University of Oulu"));
        gMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates, 18), 5000, null);
    }
}