package com.example.zain.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.TextureView;


public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // this gets called by the TopFragment when the user clicks the button
    @Override
    public void createMeme(String top, String bottom){
        BottomSectionFragment bottomFragment = (BottomSectionFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top,bottom);
    }


}
