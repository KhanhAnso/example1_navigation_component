package com.example.example1_navigation_component;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Button red = view.findViewById(R.id.red);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //navigation logic goes here
                Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_redFragment);
            }
        });
        Button green = view.findViewById(R.id.green);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //navigation logic goes here
                Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_greenFragment);
            }
        });
        Button blue = view.findViewById(R.id.blue);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //navigation logic goes here
                Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_blueFragment);

            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}