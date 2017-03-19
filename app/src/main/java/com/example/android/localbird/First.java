package com.example.android.localbird;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Divyani on 19-03-2017.
 */
public class First extends AppCompatActivity {
    // Select Location and city
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
    }
    public void Move(View v)
    {
        Intent i=new Intent(First.this,list.class);;
          startActivity(i);
    }
}

