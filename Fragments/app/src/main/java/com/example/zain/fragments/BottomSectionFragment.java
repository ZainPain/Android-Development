package com.example.zain.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomSectionFragment extends Fragment{

    private static TextView topText;
    private static TextView bottomText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bottom_section, container, false);

        topText = (TextView) v.findViewById(R.id.topText);
        bottomText = (TextView) v.findViewById(R.id.bottomText);
        return v;
    }

    public void setMemeText(String top, String bottom){
        topText.setText(top);
        bottomText.setText(bottom);
    }
}

