package com.example.android.project06_dctour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {
    public MuseumFragment() {
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
        locations.add(new Location(getString(R.string.air_space_museum),
                getString(R.string.air_space_address),
                getString(R.string.air_space_summary),
                R.drawable.air_space_museum,
                getString(R.string.air_space_url),
                getString(R.string.air_space_type)));

        locations.add(new Location(getString(R.string.newseum),
                getString(R.string.newseum_address),
                getString(R.string.newseum_summary),
                R.drawable.newseum,
                getString(R.string.newseum_url),
                getString(R.string.newseum_type)));

        //Set the adapter for the locations
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.location_list);
        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;

    }

}
