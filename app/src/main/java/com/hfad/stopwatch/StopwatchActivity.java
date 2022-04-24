package com.hfad.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class StopwatchActivity extends AppCompatActivity {

    private int seconds = 0; // variables for tracking the timer state
    private boolean  running;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
    }

    // Start the stopwatch running when the start button is clicked
    public void onClickStart(View view){
        running = true;
    }

    // Stop the stopwatch running when the stop button is clicked
    public void onClickStop(View view){
        running = true;
    }

    // Reset the stopwatch running when the reset button is clicked
    public void onClickReset(View view){
        running = false;
        seconds = 0;
    }

    




}