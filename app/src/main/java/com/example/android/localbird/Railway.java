package com.example.android.localbird;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

/**
 * Created by Divyani on 19-03-2017.
 */
public class Railway extends AppCompatActivity {

    // This Page When RailWay Station is selected from the list
    // Railway MaP TO BE shown
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.railway);
            // Calling the google PLay Services Method
            if(googleSeverciesAvailable())
            {
                Toast.makeText(this,"Perfect",Toast.LENGTH_SHORT).show();
            }
    }
    public boolean googleSeverciesAvailable()
    {
        // Check whether the user has google play services
        // Using Predefined Class
        GoogleApiAvailability api = new GoogleApiAvailability.getInstance();
        // Checking if google play services is available in this  Activity
        int isAvaiable = api.isGooglePlayServicesAvailable(this);
        if(isAvaiable == ConnectionResult.SUCCESS)
        {

            return true;

        }
        else if(api.isUserResolvableError(isAvaiable))
        {
            // Error  can be resolved by the user in its system
            Dialog dialog = api.getErrorDialog(this,isAvaiable,0);
            // 0 is the requestCode
            dialog.show();

        }
        else
        {
            // Error cannot be resolved
            Toast.makeText(this, "Cannot Connect to Play Services", Toast.LENGTH_SHORT).show();
            return false;
        }
        return false;



    }
}
