package com.example.zain.interactivelayouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        /*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
       */

        Button textViewButton = (Button) findViewById(R.id.textViewButton);

        textViewButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                TextView largeText = (TextView) findViewById(R.id.largeText);
                largeText.setText("Good job!");
            }
        });
        textViewButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView largeText = (TextView) findViewById(R.id.largeText);

                        largeText.setText("Grrreeat job!!");
                        return false;
                    }
                }
        );
        Button switchToGestures = (Button) findViewById(R.id.switchButton);

        switchToGestures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchIntent = new Intent(getApplicationContext(),Gestures.class);
                startActivity(switchIntent);

            }
        });

//        RelativeLayout mainLayout = new RelativeLayout(this);
//        mainLayout.setBackgroundColor(Color.BLACK);
//
//
//        Button redButton = new Button(this);
//        String redButtonText = "Log In";
//        redButton.setText(redButtonText);
//        redButton.setBackgroundColor(Color.CYAN);
//        redButton.setId(1);
//
//
//        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//
//                );
//
//        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
//
//
//        EditText username = new EditText(this);
//        username.setId(2);
//
//        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//
//        );
//
//        //give rules to position username widget
//
//        // we want username to be above redbutton
//        usernameDetails.addRule(RelativeLayout.ABOVE,redButton.getId());
//        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        usernameDetails.setMargins(0,0,0,50);
//
//        Resources r = getResources();
//        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
//                r.getDisplayMetrics()
//        );
//
//        username.setWidth(px);
//
//        //adding button to layout, button is now a child of the layout
//        mainLayout.addView(redButton, buttonDetails);
//
//        mainLayout.addView(username,usernameDetails);
//        //set this activities content/display to this view
//        setContentView(mainLayout);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
