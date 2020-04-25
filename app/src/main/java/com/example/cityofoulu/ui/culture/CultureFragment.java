package com.example.cityofoulu.ui.culture;

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

import com.example.cityofoulu.R;
import com.example.cityofoulu.ScienceMuseum;
import com.example.cityofoulu.UniversityOfOulu;
import com.example.cityofoulu.art_museum;


public class CultureFragment extends Fragment {

    private CultureViewModel mViewModel;

    public static CultureFragment newInstance() {
        return new CultureFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.culture_fragment, container, false);

        ImageButton imageButton = view.findViewById(R.id.science_museum_button);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ScienceMuseum.class));
            }
        });
        ImageButton imageButton1 = view.findViewById(R.id.university_button);
        imageButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), UniversityOfOulu.class));
            }
        });
        ImageButton imageButton2 = view.findViewById(R.id.art_museum_button);
        imageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), art_museum.class));
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CultureViewModel.class);
        // TODO: Use the ViewModel
    }

}
