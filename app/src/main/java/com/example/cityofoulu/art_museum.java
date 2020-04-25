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


public class art_museum extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap gMap;
    SupportMapFragment mapFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_museum);

        mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.art_museum_fragment);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;
        LatLng sciencemuseum = new LatLng(65.0190215,25.4822172);
        gMap.addMarker(new MarkerOptions().position(sciencemuseum).title("Art Museum of Oulu"));
        gMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sciencemuseum, 18), 5000, null);
    }
}
