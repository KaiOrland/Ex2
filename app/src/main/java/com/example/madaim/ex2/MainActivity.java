package com.example.madaim.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int clickCount = 0;

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

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.i(myApp.MYTAG, "main:onRestoreInstance event");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i(myApp.MYTAG, "main:onSaveInstance event");
        super.onSaveInstanceState(outState);
    }

    public void displayMessage(View view){
        clickCount++;
        findViewById(R.id.btName);
        EditText ed = (EditText)findViewById(R.id.editText);
        String name = ed.getText().toString();
        String message = getResources().getString(R.string.emptyName);
        if(name.isEmpty()){
            Toast.makeText(this,String.format(message, clickCount),Toast.LENGTH_SHORT).show();
        }
        else{
            String message2 = getResources().getString(R.string.emptyName2);
            Toast.makeText(this,String.format(message2, clickCount,name),Toast.LENGTH_LONG).show();
        }

    }

}
