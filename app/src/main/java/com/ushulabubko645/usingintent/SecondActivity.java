package com.ushulabubko645.usingintent;

import android.app.Activity;
import android.arch.lifecycle.LiveData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity {

    public void onCreate(Bundle savedIntancesState){
        super.onCreate(savedIntancesState);
        setContentView(R.layout.activity_second);
    }
    public void onClick(View view){
        Intent data = new Intent();
        //EditText txt_username = (EditText)findViewById(R.id.txtUsernameStageTwo);
        //data.setData(Uri.parse(txt_username.getText().toString()));

        //data.setData(Uri.parse("helloworld"));
        setResult(RESULT_OK, data);
        finish();
    }

}
