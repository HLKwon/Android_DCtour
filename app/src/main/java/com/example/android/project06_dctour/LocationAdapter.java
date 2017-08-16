package com.example.android.project06_dctour;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.description;


/**
 * Created by louis on 8/15/17.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    private Context context = getContext();

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Location location = getItem(position);

        //Get the object's properties
        String name = location.getName();
        String address = location.getAddress();
        String summary = location.getSummary();
        int imageID = location.getImageID();
        String url = location.getURL();
        String type = location.getType();

        //Get the ImageView and set the name of the Object
        final ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        itemImageView.setImageResource(imageID);

        //Get the TextView and set the name of the Object
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_item_name);
        nameTextView.setText(name);

        //Get the TextView and set the name of the Object
        TextView typeTextView = (TextView) listItemView.findViewById(R.id.list_item_type);
        typeTextView.setText(type);

        //Create an implicit intent to display the detailed place information if the user taps on the list item
        final Intent itemIntent = new Intent(context, LocationActivity.class);

        //Put the properties of the Object to the intent
//        itemIntent.putExtra("name_variable", name);
//        itemIntent.putExtra(context.getString(R.string.address_var), address);
//        itemIntent.putExtra(context.getString(R.string.desc_var), summary);
//        itemIntent.putExtra(context.getString(R.string.img_var), imageID);
//        itemIntent.putExtra(context.getString(R.string.site_var), url);

        Log.i("Location Adapter", "itemIntent Created");

        //Start the intent if the user taps on the list item
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });

        Log.i("Location Adapter", "itemIntent excuted");

        return listItemView;
    }
}