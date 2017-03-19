package com.example.android.localbird;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Divyani on 19-03-2017.
 */
public class list extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
    }
    public  void ToRailWay(View v)
    {
        Intent i=new Intent(list.this,Railway.class);
        startActivity(i);
    }
}
