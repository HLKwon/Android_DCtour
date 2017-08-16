package com.example.android.project06_dctour;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by louis on 8/15/17.
 */

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        //Get the properties of the Place Object from the intent
        Bundle b = getIntent().getExtras();
        String locationName = b.getString(getString(R.string.name_variable));
        String locationAddress = b.getString(getString(R.string.address_variable));
        String locationSummary = b.getString(getString(R.string.summary_variable));
        int locationImage = b.getInt(getString(R.string.image_variable));
        final String locationURL = b.getString(getString(R.string.url_variable));

        //Set the name of the place as the title of the screen
        this.setTitle(locationName);

        //Activate Up Button to enable the navigation back to the MainActivity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Set the image to the ImageView in the activity_place_details.xml
        ImageView imageView = (ImageView) findViewById(R.id.detailed_image);
        imageView.setImageResource(locationImage);

        //Set the name to the TextView in the activity_place_details.xml
        TextView nameTextView = (TextView) findViewById(R.id.detailed_name);
        nameTextView.setText(locationName);

        //Set the address to the TextView in the activity_place_details.xml
        TextView addressTextView = (TextView) findViewById(R.id.detailed_address);
        addressTextView.setText(locationAddress);

        //Set the description to the TextView in the activity_place_details.xml
        TextView descriptionTextView = (TextView) findViewById(R.id.detailed_summary);
        descriptionTextView.setText(locationSummary);

        //Create an intent for the web page of the Place Object
        TextView urlTextView = (TextView) findViewById(R.id.link_url);
        urlTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //If clicking on the icon, goes to the site of the place
                Uri webpage = Uri.parse(locationURL);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });

    }

}
