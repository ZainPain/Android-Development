package com.example.zain.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TopSectionFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TopSectionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TopSectionFragment extends Fragment {

    private static EditText topTextInput;
    private static EditText bottomTextInput;
    TopSectionListener activitCommander;

    public interface TopSectionListener{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            activitCommander = (TopSectionListener) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_top_section, container, false);

        topTextInput = (EditText) view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);
        final Button  button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }

    public void buttonClicked(View v){
        activitCommander.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }

}

