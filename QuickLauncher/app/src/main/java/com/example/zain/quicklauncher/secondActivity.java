package com.example.zain.quicklauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.example.zain.quicklauncher.SOMETHING")){
            TextView  tv = (TextView) findViewById(R.id.textview);
            String text = getIntent().getExtras().getString("com.example.zain.quicklauncher.SOMETHING");
            tv.setText(text);
        }
    }
}
