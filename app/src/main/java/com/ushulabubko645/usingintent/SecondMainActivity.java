package com.ushulabubko645.usingintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class SecondMainActivity extends Activity {

    private int request_code = 1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);
        Random randomOpgave = new Random();
    }

    private void onClick(View view){
        startActivityForResult(new Intent("com.ushulabubko645.usingintent.MainActivity"),request_code);
    }
}
