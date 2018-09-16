package com.example.zainp.tasbeeh;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.view.ViewGroup;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout rl = (RelativeLayout) findViewById(R.id.layout);
        Button cButton = new Button(this);
        TextView counter = new TextView(this);
        Button reset = new Button(this);

        counter.setId(1);
        cButton.setId(2);

        RelativeLayout.LayoutParams counterParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
//        //counterParams.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.TRUE);
//        counterParams.addRule(RelativeLayout.CENTER_HORIZONTAL, RelativeLayout.TRUE);
//        counterParams.addRule(RelativeLayout.ALIGN_TOP, RelativeLayout.TRUE);

        int width = this.getResources().getDisplayMetrics().widthPixels;
        int height = this.getResources().getDisplayMetrics().heightPixels ;
        counterParams.setMargins(0,height/2 - 750,0,0);
        counterParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

        RelativeLayout.LayoutParams cButtonParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        cButtonParams.addRule(RelativeLayout.BELOW,counter.getId());
        cButtonParams.addRule(RelativeLayout.CENTER_HORIZONTAL,counter.getId());
        cButtonParams.setMargins(0,650,0,0);

        RelativeLayout.LayoutParams resetParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        resetParam.addRule(RelativeLayout.BELOW,cButton.getId());
        resetParam.addRule(RelativeLayout.CENTER_HORIZONTAL);
        resetParam.setMargins(0,100,0,0);

        counter.setText("0");
        counter.setTextSize(50);
        //counter.setBackgroundColor(Color.rgb(0,255,255));
        counter.setBackgroundColor(Color.rgb(255,255,255));
        counter.setPadding(200,0,200,0);
        cButton.setText("+");
        cButton.setTextSize(50);
        cButton.setWidth(cButton.getWidth() * 2);
        cButton.setBackgroundColor(Color.rgb(0,255,255));

        reset.setText("Reset");
        reset.setTextSize(40);
        reset.setBackgroundColor(Color.rgb(220,20,60));

        counter.setLayoutParams(counterParams);
        cButton.setLayoutParams(cButtonParams);
        reset.setLayoutParams(resetParam);

        rl.setBackgroundColor(Color.rgb(0,0,0));
        rl.addView(counter);
        rl.addView(cButton);
        rl.addView(reset);


        cButton.setOnClickListener( new Button.OnClickListener(){
            public void onClick(View v){
                int count;
                TextView counter = (TextView) findViewById(1);
                count = Integer.parseInt(counter.getText().toString());
                count++;
                if(count == Integer.MAX_VALUE)
                    count = 0;
                counter.setText(Integer.toString(count));

            }
        });
        reset.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                TextView counter = (TextView) findViewById(1);
                counter.setText("0");
            }
        });
    }
}
