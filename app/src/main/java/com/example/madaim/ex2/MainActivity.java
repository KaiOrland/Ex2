package com.example.madaim.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        Log.i(myApp.MYTAG, "main:onDestroy event");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.i(myApp.MYTAG, "main:onStop event");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.i(myApp.MYTAG, "main:onPause event");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.i(myApp.MYTAG, "main:onResume event");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.i(myApp.MYTAG, "main:onStart event");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.i(myApp.MYTAG, "main:onRestart event");
        super.onRestart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(myApp.MYTAG, "main:onCreate event");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
