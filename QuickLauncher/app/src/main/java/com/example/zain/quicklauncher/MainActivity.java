package com.example.zain.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button googleButton = (Button) findViewById(R.id.googleButton);
        Button activityButton = (Button) findViewById(R.id.activityButton);
        Button swagButton = (Button) findViewById(R.id.swagButton);

        //attempts to launch activity within app

        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // linking intent and activity together
                Intent activityIntent = new Intent(getApplicationContext(),secondActivity.class);
                activityIntent.putExtra("com.example.zain.quicklauncher.SOMETHING","Hello Friend");
                // show how to pass information to another activity
                startActivity(activityIntent);
            }
        });

        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String google = "http://google.com";
                Uri website = Uri.parse(google);

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, website);

                // if the the response was not null.. e.g. there is an app that can handle this request
                if(goToGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToGoogle);

                }
            }
        });
    }
}
