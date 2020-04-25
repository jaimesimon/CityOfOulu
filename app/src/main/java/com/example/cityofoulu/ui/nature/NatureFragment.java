package com.example.cityofoulu.ui.nature;

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
import com.example.cityofoulu.Hupisaaret;
import com.example.cityofoulu.Pikisaari;
import com.example.cityofoulu.R;


public class NatureFragment extends Fragment {

    private NatureViewModel mViewModel;

    public static NatureFragment newInstance() {
        return new NatureFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nature_fragment, container, false);

        ImageButton imageButton = view.findViewById(R.id.hupisaaret_button);
        imageButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Hupisaaret.class));
            }
        });
        ImageButton imageButton1 = view.findViewById(R.id.beach_button);
        imageButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Beach.class));
            }
        });
        ImageButton imageButton2 = view.findViewById(R.id.pikisaari_button);
        imageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Pikisaari.class));
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(NatureViewModel.class);
        // TODO: Use the ViewModel
    }

}
