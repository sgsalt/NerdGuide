package com.example.android.nerdguide;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ComicsFragment extends Fragment {


    public ComicsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        //Create the venue array
        final ArrayList<VenueContent> venueContents = new ArrayList<>();
        venueContents.add(new VenueContent(R.drawable.forbidden_planet, "Cardiff", R.string.forbidden_planet_name,
                R.string.forbidden_planet_hashtags, R.string.forbidden_planet_details, R.string.forbidden_planet_address,
                R.string.forbidden_planet_phone, R.string.forbidden_planet_times));
        venueContents.add(new VenueContent(R.drawable.fantasy_centre, "Cardiff", R.string.fantasy_centre_name,
                R.string.fantasy_centre_hashtags, R.string.fantasy_centre_details, R.string.fantasy_centre_address,
                R.string.fantasy_centre_phone, R.string.fantasy_centre_times));
        venueContents.add(new VenueContent(R.drawable.troutmark, "Cardiff", R.string.troutmark_name,
                R.string.troutmark_hashtags, R.string.troutmark_details, R.string.troutmark_address,
                R.string.troutmark_phone, R.string.troutmark_times));

        // Create a ContentAdapter whose data source is the list of venues.
        ContentAdapter adapter = new ContentAdapter(getActivity(), venueContents, R.color.colorPrimary);

        //Find the ListView object in the view hierarchy, The ListView called list is
        // declared in the venue_list.xml layout file
        ListView listView = rootView.findViewById(R.id.list);

        //Set the ListView on the ContentAdapter created above
        listView.setAdapter(adapter);

        return rootView;

    }

}