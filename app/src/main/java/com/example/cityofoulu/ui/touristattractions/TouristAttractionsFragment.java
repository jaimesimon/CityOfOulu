package com.example.cityofoulu.ui.touristattractions;

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


import com.example.cityofoulu.Beach;
import com.example.cityofoulu.BotanicalGarden;
import com.example.cityofoulu.Castle;
import com.example.cityofoulu.Cathedral;
import com.example.cityofoulu.Hupisaaret;
import com.example.cityofoulu.Market;
import com.example.cityofoulu.Pikisaari;
import com.example.cityofoulu.Police_man;
import com.example.cityofoulu.R;

public class TouristAttractionsFragment extends Fragment {

    private TouristAttractionsViewModel mViewModel;

    public static TouristAttractionsFragment newInstance() {
        return new TouristAttractionsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tourist_attractions_fragment, container, false);

        ImageButton imageButton = view.findViewById(R.id.market_button);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Market.class));
            }
        });
        ImageButton imageButton1 = view.findViewById(R.id.police_button);
        imageButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Police_man.class));
            }
        });
        ImageButton imageButton2 = view.findViewById(R.id.cathedral_button);
        imageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Cathedral.class));
            }
        });
        ImageButton imageButton3 = view.findViewById(R.id.castle_button);
        imageButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Castle.class));
            }
        });
        ImageButton imageButton4 = view.findViewById(R.id.garden_botanic_button);
        imageButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BotanicalGarden.class));
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TouristAttractionsViewModel.class);
        // TODO: Use the ViewModel
    }

}
