package com.example.cityofoulu.ui.hotels;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.cityofoulu.Hotel2;
import com.example.cityofoulu.Hotel3;
import com.example.cityofoulu.R;
import com.example.cityofoulu.ScienceMuseum;
import com.example.cityofoulu.UniversityOfOulu;
import com.example.cityofoulu.art_museum;
import com.example.cityofoulu.hotel1;


public class HotelsFragment extends Fragment {

    private HotelsViewModel mViewModel;

    public static HotelsFragment newInstance() {
        return new HotelsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hotels_fragment, container, false);

        ImageButton imageButton = view.findViewById(R.id.hotel1_button);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), hotel1.class));
            }
        });
        ImageButton imageButton1 = view.findViewById(R.id.hotel2_button);
        imageButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Hotel2.class));
            }
        });
        ImageButton imageButton2 = view.findViewById(R.id.hotel3_button);
        imageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Hotel3.class));
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(HotelsViewModel.class);
        // TODO: Use the ViewModel
    }

}
