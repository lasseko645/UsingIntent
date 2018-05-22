package com.ushulabubko645.usingintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends Activity {
    int request_code = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random randomOpgave = new Random();
    }
    public void onClick(View view){
        startActivityForResult(new Intent("com.ushulabubko645.UsingIntent.SecondActivity"), request_code);

    }
    public void onActivationResult(int requestCode, int resultCode, Intent data){
        if (requestCode==request_code){
            if (resultCode == RESULT_OK){
                Toast.makeText(this,data.getData().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }


}
