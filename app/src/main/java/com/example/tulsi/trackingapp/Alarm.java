package com.example.tulsi.trackingapp;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.Date;


@IgnoreExtraProperties
class info2 {

    public double latitude;
    public double longtitude;
    public Date acqdate;


    public info2() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public info2(double latitude, double longtitude, Date acqdate) {
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.acqdate = acqdate;
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }


}

public class Alarm extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
    }

    public void Emergency(View view) {
        Snackbar.make(view, "Send text message later I think", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

        //-30.088366, 145.971019 middle of aus
        double latitude = -30.088366;
        double longitude = 145.971019;
        database = FirebaseDatabase.getInstance();
       // location.setText(latitude+""+longitude);
        myRef = database.getReference();

        info2 test = new info2(latitude, longitude, new Date(2000,1,1));
        myRef.child("users").child("userMobile").setValue(test);

    }
}
