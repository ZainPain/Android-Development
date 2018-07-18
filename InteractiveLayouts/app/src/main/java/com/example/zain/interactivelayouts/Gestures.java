package com.example.zain.interactivelayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;


public class Gestures extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    private TextView gestureAction;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestures);

        gestureAction = (TextView) findViewById(R.id.gestureActionTextView);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        //gestureAction.setText("onSingleTapConfirmed occurred!");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        gestureAction.setText("onDoubleTap occurred!");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        //gestureAction.setText("onDoubleTapEvent occurred!");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        gestureAction.setText("onDown occurred!");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        gestureAction.setText("onShowPress occurred!");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        gestureAction.setText("onSingleTapUp occurred!");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        gestureAction.setText("onScroll occurred!");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        gestureAction.setText("onLongPress occurred!");


    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        gestureAction.setText("onFling occurred!");
        return true;
    }


    @Override
    public boolean onTouchEvent(MotionEvent e){
        this.gestureDetector.onTouchEvent(e);
        return super.onTouchEvent(e);
    }


}
