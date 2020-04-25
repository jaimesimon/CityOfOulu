package com.example.cityofoulu.ui.sports;

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

import com.example.cityofoulu.Footbal;
import com.example.cityofoulu.IceHockey;
import com.example.cityofoulu.R;

import com.example.cityofoulu.art_museum;


public class SportsFragment extends Fragment {

    private SportsViewModel mViewModel;

    public static SportsFragment newInstance() {
        return new SportsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sports_fragment, container, false);

        ImageButton imageButton = view.findViewById(R.id.ice_hockey_button);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), IceHockey.class));
            }
        });
        ImageButton imageButton1 = view.findViewById(R.id.football_button);
        imageButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Footbal.class));
            }
        });


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SportsViewModel.class);
        // TODO: Use the ViewModel
    }

}
