package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;

public class DetailActivity extends AppCompatActivity {

    private TextView placeName, placeContent;
    private FloatingActionButton navigator;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        placeName = findViewById(R.id.text1);
        placeContent = findViewById(R.id.text2);
        navigator = findViewById(R.id.button1);


        String place_name = getIntent().getStringExtra("place_name");
        String place_content = getIntent().getStringExtra("place_content");
        String Location = getIntent().getStringExtra("Location");
        String[] splitLoc = Location.split(",");

            placeName.setText(place_name);
            placeContent.setText(place_content.toString());

            navigator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String geoUri = "http://maps.google.com/maps?q=loc:" + splitLoc[0] + "," + splitLoc[1] + " (" + place_name + ")";
               String uri =String.format(Locale.ENGLISH,geoUri);
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

    }
}