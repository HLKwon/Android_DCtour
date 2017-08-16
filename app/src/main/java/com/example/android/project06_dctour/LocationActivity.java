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

        Log.i("LocationActivity", "Inside LocationActivity");

        //Get the properties of the Place Object from the intent
//        Bundle b = getIntent().getExtras();
//        String placeName = b.getString(getString(R.string.address_var);
//        String placeAddress = b.getString(getString(R.string.address_var));
//        String placeDescription = b.getString(getString(R.string.desc_var));
//        int placeImage = b.getInt(getString(R.string.img_var));
//        final String placeSite = b.getString(getString(R.string.site_var));
//
        //Set the name of the place as the title of the screen
//        String placeName = "Air Museum";
//        this.setTitle(placeName);
//
        //Activate Up Button to enable the navigation back to the MainActivity
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
        //Set the image to the ImageView in the activity_place_details.xml
//        ImageView imageView = (ImageView) findViewById(R.id.detailed_image);
//        imageView.setImageResource(placeImage);
//
//        //Set the name to the TextView in the activity_place_details.xml
//        TextView nameTextView = (TextView) findViewById(R.id.detailed_name);
//        nameTextView.setText(placeName);
//
//        //Set the address to the TextView in the activity_place_details.xml
//        TextView addressTextView = (TextView) findViewById(R.id.detailed_address);
//        addressTextView.setText(placeAddress);
//
//        //Set the description to the TextView in the activity_place_details.xml
//        TextView descriptionTextView = (TextView) findViewById(R.id.detailed_desc);
//        descriptionTextView.setText(placeDescription);

        //Create an intent for the web page of the Place Object
//        LinearLayout linkView = (LinearLayout) findViewById(R.id.link_webpage);
//        linkView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                //If clicking on the icon, goes to the site of the place
//                Uri webpage = Uri.parse(placeSite);
//                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
//                if (webIntent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(webIntent);
//                }
//            }
//        });

    }

}
