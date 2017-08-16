package com.example.android.project06_dctour;

/**
 * Created by louis on 8/15/17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.project06_dctour.R;

import java.util.ArrayList;

public class FoodFragment extends Fragment {
    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the list
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create the ArrayList for the locations
        ArrayList<Location> locations = new ArrayList<Location>();

        //Add the locations to the ArrayList
        locations.add(new Location(getString(R.string.rasika),
                getString(R.string.rasika_address),
                getString(R.string.rasika_summary),
                R.drawable.rasika,
                getString(R.string.rasika_url),
                getString(R.string.rasika_type)));

        //Set the adapter for the locations
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.location_list);
        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }

}

