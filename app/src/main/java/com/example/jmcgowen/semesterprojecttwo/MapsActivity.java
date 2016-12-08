package com.example.jmcgowen.semesterprojecttwo;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


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

        // Add a marker in Sydney and move the camera
        LatLng nebraska = new LatLng(40.9087, -98.3462);
        mMap.addMarker(new MarkerOptions().position(nebraska).title("Marker in Grand Island NE at Career Pathway Insitue"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nebraska));
    }
}
/*{
        "results" : [
        {
        "address_components" : [
        {
        "long_name" : "68801",
        "short_name" : "68801",
        "types" : [ "postal_code" ]
        },
        {
        "long_name" : "Grand Island",
        "short_name" : "Grand Island",
        "types" : [ "locality", "political" ]
        },
        {
        "long_name" : "Nebraska",
        "short_name" : "NE",
        "types" : [ "administrative_area_level_1", "political" ]
        },
        {
        "long_name" : "United States",
        "short_name" : "US",
        "types" : [ "country", "political" ]
        }
        ],
        "formatted_address" : "Grand Island, NE 68801, USA",
        "geometry" : {
        "bounds" : {
        "northeast" : {
        "lat" : 41.07536500000001,
        "lng" : -98.1750819
        },
        "southwest" : {
        "lat" : 40.808755,
        "lng" : -98.397876
        }
        },
        "location" : {
        "lat" : 40.96284740000001,
        "lng" : -98.28694779999999
        },
        "location_type" : "APPROXIMATE",
        "viewport" : {
        "northeast" : {
        "lat" : 41.07536500000001,
        "lng" : -98.1750819
        },
        "southwest" : {
        "lat" : 40.808755,
        "lng" : -98.397876
        }
        }
        },
        "place_id" : "ChIJi8dmY4iImYcRU0CvNuKBxp0",
        "types" : [ "postal_code" ]
        }
        ],
        "status" : "OK"
        }*/