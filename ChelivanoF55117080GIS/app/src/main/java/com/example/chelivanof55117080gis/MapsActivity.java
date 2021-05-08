package com.example.chelivanof55117080gis;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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

        //Custom Size Marker
        int tinggi = 100;
        int lebar = 100;
        BitmapDrawable MyHome = (BitmapDrawable)getResources().getDrawable(R.drawable.icon2);
        Bitmap a = MyHome.getBitmap();
        Bitmap markerHome = Bitmap.createScaledBitmap(a, lebar, tinggi, false);
        BitmapDrawable Resto = (BitmapDrawable)getResources().getDrawable(R.drawable.icon);
        Bitmap b = Resto.getBitmap();
        Bitmap markerResto = Bitmap.createScaledBitmap(b, lebar, tinggi, false);


        // Add Latitude & Longitude
        LatLng Home = new LatLng(-0.9205152, 119.8611922);
        LatLng RMDM = new LatLng(-0.9230249132677071, 119.8653829075447);
        LatLng RMPP = new LatLng(-0.9225415, 119.8637256);
        LatLng WMT = new LatLng(-0.9230284, 119.8674955);
        LatLng NGRAS = new LatLng(-0.925292, 119.8612289);
        LatLng WMBB = new LatLng(-0.921803, 119.87055);
        LatLng WMKL = new LatLng(-0.9228338, 119.8672041);
        LatLng RBP = new LatLng(-0.922821, 119.8682786);
        LatLng WMLF = new LatLng(-0.9274068, 119.8615717);
        LatLng FCE = new LatLng(-0.9229326, 119.8658386);
        LatLng RMMKS = new LatLng(-0.9182991, 119.8765707);

        //Add Marker to Map
        mMap.addMarker(new MarkerOptions().position(Home).title("Home").icon(BitmapDescriptorFactory.fromBitmap(markerHome)));
        mMap.addMarker(new MarkerOptions().position(RMDM).title("RM Duta Minang").snippet("Rumah Makan Masakan Padang").icon(BitmapDescriptorFactory.fromBitmap(markerResto)));
        mMap.addMarker(new MarkerOptions().position(RMPP).title("RM. PANGKEP Cab.Kemiri Pasar Inpres").snippet("Rumah Makan Sop Saudara Konro & Kikil").icon(BitmapDescriptorFactory.fromBitmap(markerResto)));
        mMap.addMarker(new MarkerOptions().position(WMT).title("Warung Makan Tavanjuka").snippet("Warung Makan Tavanjuka").icon(BitmapDescriptorFactory.fromBitmap(markerResto)));
        mMap.addMarker(new MarkerOptions().position(NGRAS).title("Nasi Goreng R.A Serundeng's").snippet("Nasi Goreng R.A Serundeng's").icon(BitmapDescriptorFactory.fromBitmap(markerResto)));
        mMap.addMarker(new MarkerOptions().position(WMBB).title("Warung Makan Bangil Baru").snippet("Warung Makan Bangil Baru").icon(BitmapDescriptorFactory.fromBitmap(markerResto)));
        mMap.addMarker(new MarkerOptions().position(WMKL).title("Warung makan Kaili").snippet("Rumah Makan Masakan Kaili").icon(BitmapDescriptorFactory.fromBitmap(markerResto)));
        mMap.addMarker(new MarkerOptions().position(RBP).title("RUJAK BANGKOK PALU").snippet("RUJAK BANGKOK PALU").icon(BitmapDescriptorFactory.fromBitmap(markerResto)));
        mMap.addMarker(new MarkerOptions().position(WMLF).title("Warung Makan Likuifaksi").snippet("Warung Makan Likuifaksi").icon(BitmapDescriptorFactory.fromBitmap(markerResto)));
        mMap.addMarker(new MarkerOptions().position(FCE).title("FIAJI Coffee").snippet("Warung Kopi FIAJI").icon(BitmapDescriptorFactory.fromBitmap(markerResto)));
        mMap.addMarker(new MarkerOptions().position(RMMKS).title("RM. MAKASSAR").snippet("Rumah Makan Masakan Makkasar").icon(BitmapDescriptorFactory.fromBitmap(markerResto)));

        mMap.addPolyline(new PolylineOptions().add (
                Home,
                new LatLng(-0.9205152,119.8611922),
                new LatLng(-0.920535,119.861193),
                new LatLng(-0.920554,119.863480),
                new LatLng(-0.921525,119.863465),
                new LatLng(-0.922719,119.863355),
                new LatLng(-0.922791,119.864522),
                new LatLng(-0.922896,119.865389),
                new LatLng(-0.9230249132677071, 119.8653829075447),
                RMDM
                ).width(10)
                        .color(Color.RED)
        );

        mMap.moveCamera(CameraUpdateFactory.newLatLng(Home));
    }
}