package com.example.tulsi.trackingapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private ArrayList<LatLng> latlngs = new ArrayList<>();
    private GoogleMap mMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


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





        mMap.addMarker(marker);


        for(int i=0; i<latlngs.size(); ++i)
        {
            //MarkerOptions marker = new MarkerOptions().position(sydney).title("testest");
           // marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.flame));
            mMap.addMarker(new MarkerOptions().position(latlngs.get(i)).title("testest").icon(BitmapDescriptorFactory.fromResource(R.drawable.flame)));
        }

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //mMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        CameraUpdate zoom = CameraUpdateFactory.zoomTo(12);
        mMap.moveCamera(zoom);
        mMap.animateCamera(zoom);
    }
}
