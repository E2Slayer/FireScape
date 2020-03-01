package com.example.tulsi.trackingapp;

import android.location.Location;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.example.tulsi.trackingapp.Main2Activity.latlngs23;


class info {

    public double laditude;
    public double longditude;
    public String aqrDate;

    public info() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public info(double laditude, double longditude, String aqrDate) {
        this.laditude = laditude;
        this.longditude = longditude;
        this.aqrDate = aqrDate;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("latitiude", laditude);
        result.put("longitude", longditude);
        result.put("acq_date", aqrDate);


        return result;
    }


}

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private ArrayList<LatLng> latlngs = new ArrayList<>();
    private ArrayList<LatLng> latlngs2 = new ArrayList<>();
    private GoogleMap mMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        FirebaseDatabase database = FirebaseDatabase.getInstance();


        //DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("server/firedata/australia/0");
        DatabaseReference database2 = FirebaseDatabase.getInstance().getReference();
        DatabaseReference ref = database2.child("server").child("firedata").child("australia");

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot childSnapshot: dataSnapshot.getChildren()) {
                    String lad = childSnapshot.child("latitiude").getValue(String.class);
                    String longd = childSnapshot.child("longitude").getValue(String.class);
                    String acq = childSnapshot.child("acq_date").getValue(String.class);
                    //Log.d(TAG, "Score: " + score);
                    double con_lad = Double.valueOf(lad);
                    double con_longd = Double.valueOf(longd);


                    latlngs2.add(new LatLng(con_lad, con_longd));
                    Log.d("HELOOOO", "HELOOOO "+ Double.valueOf(lad) +" "+Double.valueOf(longd) + " "+acq +" "+latlngs2.size());
                }
              //  info post = dataSnapshot.getValue(info.class);


                //  String likes = dataSnapshot.getValue(String.class);
               // Log.d("HELOOOO", "HELOOOO "+ likes);

               // double lad = dataSnapshot.child("latitude").getValue(double.class);
                //double longd = dataSnapshot.child("longitude").getValue(double.class);
                //String acq = dataSnapshot.child("acq_date").getValue(String.class);
               // Log.d("HELOOOO", "HELOOOO "+ post.laditude +" "+post.longditude + " "+post.aqrDate);
                /*
                for (DataSnapshot childSnapshot: dataSnapshot.getChildren())
                {
                    double lad = childSnapshot.child("latitude").getValue(double.class);
                    double longd = childSnapshot.child("longitude").getValue(double.class);
                    String acq = childSnapshot.child("acq_date").getValue(String.class);

                    // info clubkey = childSnapshot.getValue(info.class);
                    Log.d("HELOOOO", "HELOOOO "+ lad +" "+longd + " "+acq);
                }
*/
               // info email = dataSnapshot.getValue(info.class);
               // Log.d("HELOOOO", "HELOOOO "+email.laditude);
                //do what you want with the email
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }

        });


        latlngs.add(new LatLng(-18.422,145.321));
        latlngs.add(new LatLng(-18.42,145.308));
        latlngs.add(new LatLng(-18.411,145.322));
        latlngs.add(new LatLng(-18.105,143.001));
        latlngs.add(new LatLng(-18.415,145.329));
        latlngs.add(new LatLng(-18.414,145.316));
        latlngs.add(new LatLng(-18.405,145.33));
        latlngs.add(new LatLng(-18.403,145.317));
        latlngs.add(new LatLng(-18.39,145.217));
        latlngs.add(new LatLng(-18.395,145.331));
        latlngs.add(new LatLng(-18.393,145.318));
        latlngs.add(new LatLng(-18.383,145.32));
        latlngs.add(new LatLng(-18.362,145.322));
        latlngs.add(new LatLng(-18.36,145.31));
        latlngs.add(new LatLng(-18.118,144.235));
        latlngs.add(new LatLng(-18.117,144.224));
        latlngs.add(new LatLng(-17.85,143.335));
        latlngs.add(new LatLng(-17.131,139.601));
        latlngs.add(new LatLng(-17.071,139.374));
        latlngs.add(new LatLng(-16.67,137.943));
        latlngs.add(new LatLng(-16.519,137.339));
        latlngs.add(new LatLng(-16.364,137.706));
        latlngs.add(new LatLng(-16.361,137.692));
        latlngs.add(new LatLng(-16.359,137.678));
        latlngs.add(new LatLng(-16.36,137.699));
        latlngs.add(new LatLng(-16.357,137.685));
        latlngs.add(new LatLng(-17.405,145.239));
        latlngs.add(new LatLng(-17.084,144.658));
        latlngs.add(new LatLng(-16.642,145.161));
        latlngs.add(new LatLng(-16.64,145.148));
        latlngs.add(new LatLng(-16.63,145.15));
        latlngs.add(new LatLng(-14.856,134.296));
        latlngs.add(new LatLng(-14.856,134.303));
        latlngs.add(new LatLng(-14.851,134.277));
        latlngs.add(new LatLng(-15.957,143.412));
        latlngs.add(new LatLng(-15.95,143.419));
        latlngs.add(new LatLng(-15.573,141.542));
        latlngs.add(new LatLng(-16.017,145.133));
        latlngs.add(new LatLng(-16.016,145.122));
        latlngs.add(new LatLng(-16.014,145.111));
        latlngs.add(new LatLng(-16.006,145.123));
        latlngs.add(new LatLng(-16.004,145.112));
        latlngs.add(new LatLng(-16.004,145.118));
        latlngs.add(new LatLng(-15.407,142.97));
        latlngs.add(new LatLng(-15.137,141.709));
        latlngs.add(new LatLng(-15.128,141.71));
        latlngs.add(new LatLng(-15.118,141.702));
        latlngs.add(new LatLng(-21.417,140.841));
        latlngs.add(new LatLng(-19.608,144.572));
        latlngs.add(new LatLng(-19.598,144.573));
        latlngs.add(new LatLng(-19.599,144.579));
        latlngs.add(new LatLng(-19.597,144.567));
        latlngs.add(new LatLng(-19.414,143.359));
        latlngs.add(new LatLng(-19.238,146.124));
        latlngs.add(new LatLng(-19.216,146.127));
        latlngs.add(new LatLng(-19.205,146.128));
        latlngs.add(new LatLng(-19.147,145.929));
        latlngs.add(new LatLng(-18.469,144.038));
        latlngs.add(new LatLng(-18.297,143.117));
        latlngs.add(new LatLng(-18.16,142.993));
        latlngs.add(new LatLng(-18.148,142.975));
        latlngs.add(new LatLng(-18.439,145.293));
        latlngs.add(new LatLng(-18.438,145.281));
        latlngs.add(new LatLng(-14.72,143.769));
        latlngs.add(new LatLng(-14.718,143.75));
        latlngs.add(new LatLng(-14.714,143.777));
        latlngs.add(new LatLng(-14.712,143.767));
        latlngs.add(new LatLng(-14.483,143.58));
        latlngs.add(new LatLng(-14.475,143.591));
        latlngs.add(new LatLng(-14.474,143.581));
        latlngs.add(new LatLng(-13.205,143.147));
        latlngs.add(new LatLng(-21.499,140.772));
        latlngs.add(new LatLng(-21.508,140.771));
        latlngs.add(new LatLng(-20.993,135.269));
        latlngs.add(new LatLng(-20.998,135.262));
        latlngs.add(new LatLng(-21.001,135.28));
        latlngs.add(new LatLng(-19.617,144.558));
        latlngs.add(new LatLng(-24.651,146.807));
        latlngs.add(new LatLng(-24.664,146.806));
        latlngs.add(new LatLng(-24.877,147.755));
        latlngs.add(new LatLng(-24.871,147.749));
        latlngs.add(new LatLng(-25.405,149.223));
        latlngs.add(new LatLng(-25.417,149.19));
        latlngs.add(new LatLng(-25.045,128.903));
        latlngs.add(new LatLng(-25.055,128.946));
        latlngs.add(new LatLng(-25.062,128.898));
        latlngs.add(new LatLng(-25.047,128.896));
        latlngs.add(new LatLng(-21.376,140.691));
        latlngs.add(new LatLng(-21.369,140.702));
        latlngs.add(new LatLng(-21.367,140.692));
        latlngs.add(new LatLng(-21.35,140.701));
        latlngs.add(new LatLng(-20.531,138.579));
        latlngs.add(new LatLng(-19.279,139.125));
        latlngs.add(new LatLng(-19.91,144.546));
        latlngs.add(new LatLng(-19.902,144.56));
        latlngs.add(new LatLng(-19.9,144.548));
        latlngs.add(new LatLng(-19.885,144.586));
        latlngs.add(new LatLng(-19.842,144.489));
        latlngs.add(new LatLng(-19.844,144.586));
    }

        public void showAlertDialogButtonClicked(View view, double pos) {        // setup the alert builder


            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("WARNING");
            builder.setMessage("YOU ARE IN DANGER PLEASE EVACUATE "+pos);        // add a button
            builder.setPositiveButton("OK", null);        // create and show the alert dialog
            AlertDialog dialog = builder.create();
            dialog.show();




    }

    public double CalculationByDistance(LatLng StartP, LatLng EndP) {
        int Radius = 6371;// radius of earth in Km
        double lat1 = StartP.latitude;
        double lat2 = EndP.latitude;
        double lon1 = StartP.longitude;
        double lon2 = EndP.longitude;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1))
                * Math.cos(Math.toRadians(lat2)) * Math.sin(dLon / 2)
                * Math.sin(dLon / 2);
        double c = 2 * Math.asin(Math.sqrt(a));
        double valueResult = Radius * c;
        double km = valueResult / 1;
        DecimalFormat newFormat = new DecimalFormat("####");
        int kmInDec = Integer.valueOf(newFormat.format(km));
        double meter = valueResult % 1000;
        int meterInDec = Integer.valueOf(newFormat.format(meter));
        Log.i("Radius Value", "" + valueResult + "   KM  " + kmInDec
                + " Meter   " + meterInDec);

        return meterInDec;
    }

    static LatLng currentMarker = new LatLng(-33.852, 151.211);
    static final LatLng myLocation = new LatLng(-33.852, 151.211);

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMarkerDragListener(new GoogleMap.OnMarkerDragListener() {
            @Override
            public void onMarkerDragStart(Marker marker) {

            }

            @Override
            public void onMarkerDrag(Marker marker) {

            }

            @Override
            public void onMarkerDragEnd(Marker marker) {

                currentMarker = marker.getPosition();

                for(int i=0; i<latlngs23.size(); ++i)
                {
                    Location markerLoc = new Location("Marker");
                    markerLoc.setLatitude(marker.getPosition().latitude);
                    markerLoc.setLongitude(marker.getPosition().longitude);

                    Location markerLoc2 = new Location("Marker");
                    markerLoc2.setLatitude(latlngs23.get(i).latitude);
                    markerLoc2.setLongitude(latlngs23.get(i).longitude);
                    double calc = markerLoc.distanceTo(markerLoc2);
                    //double calc = CalculationByDistance(marker.getPosition(), latlngs23.get(i));
                    if (calc < 10000.0)
                    {
                        showAlertDialogButtonClicked(null, calc);
                        break;
                    }
                }

               // showAlertDialogButtonClicked(null, marker.getPosition());

            }

        });
        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng arg0) {
                MarkerOptions marker = new MarkerOptions().position(arg0).title("new one");
                marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.flame));
                mMap.addMarker(marker);
                // TODO Auto-generated method stub
               // Log.d("arg0", arg0.latitude + "-" + arg0.longitude);
            }
        });
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-33.852, 151.211);
        MarkerOptions marker = new MarkerOptions().position(myLocation).title("testest").draggable(true);
        marker.icon(BitmapDescriptorFactory.defaultMarker(1));

        currentMarker = sydney;





        mMap.addMarker(marker);

        Log.d("HELOOOO", "SIZEEEEEEEEEEEEEEEEE "+latlngs23.size());
        for(int i=0; i<latlngs23.size(); ++i)
        {
            //MarkerOptions marker = new MarkerOptions().position(sydney).title("testest");
           // marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.flame));
            mMap.addMarker(new MarkerOptions().position(latlngs23.get(i)).title("testest").icon(BitmapDescriptorFactory.fromResource(R.drawable.flame)));
        }

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //mMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        CameraUpdate zoom = CameraUpdateFactory.zoomTo(12);
        mMap.moveCamera(zoom);
        mMap.animateCamera(zoom);



    }


    public void Emergency(View view) {
        FirebaseDatabase database;
        DatabaseReference myRef;


        //-30.088366, 145.971019 middle of aus
        double latitude = currentMarker.latitude;
        double longitude = currentMarker.longitude;
        database = FirebaseDatabase.getInstance();
        // location.setText(latitude+""+longitude);
        myRef = database.getReference();


        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        Date date = new Date(System.currentTimeMillis());
       // System.out.println(formatter.format(date));

        info test = new info(latitude, longitude, formatter.format(date));
        myRef.child("users").child("userMobile").setValue(test);

        Snackbar.make(view, "Sent Help to Emergency Contacts!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
