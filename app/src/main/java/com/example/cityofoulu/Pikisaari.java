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


public class Pikisaari extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap gMap;
    SupportMapFragment mapFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pikisaari);

        mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.pikisaari_fragment);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;
        LatLng coordinates = new LatLng(65.0174709,25.439493);
        gMap.addMarker(new MarkerOptions().position(coordinates).title("Pikisaari"));
        gMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coordinates, 18), 5000, null);
    }
}
