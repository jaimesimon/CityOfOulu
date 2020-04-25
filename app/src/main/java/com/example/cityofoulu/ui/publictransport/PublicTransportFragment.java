package com.example.cityofoulu.ui.publictransport;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;


import com.example.cityofoulu.Airport;
import com.example.cityofoulu.BusStation;
import com.example.cityofoulu.R;

import com.example.cityofoulu.TrainStation;


public class PublicTransportFragment extends Fragment {

    private PublicTransportViewModel mViewModel;

    public static PublicTransportFragment newInstance() {
        return new PublicTransportFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.public_transport_fragment, container, false);

        ImageButton imageButton = view.findViewById(R.id.train_station_button);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), TrainStation.class));
            }
        });
        ImageButton imageButton1 = view.findViewById(R.id.bus_station_button);
        imageButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BusStation.class));
            }
        });
        ImageButton imageButton2 = view.findViewById(R.id.airport_button);
        imageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Airport.class));
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PublicTransportViewModel.class);
        // TODO: Use the ViewModel
    }

}
