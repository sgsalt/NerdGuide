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
public class VinylFragment extends Fragment {


    public VinylFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        //Create the venue array
        final ArrayList<VenueContent> venueContents = new ArrayList<>();
        venueContents.add(new VenueContent(R.drawable.divinyl, "Cardiff", R.string.dvinyl_name,
                R.string.dvinyl_hashtags, R.string.dvinyl_details, R.string.dvinyl_address, R.string.dvinyl_phone,
                R.string.dvinyl_times));
        venueContents.add(new VenueContent(R.drawable.spillers, "Cardiff", R.string.spillers_name,
                R.string.spillers_hashtags, R.string.spillers_details, R.string.spillers_address, R.string.spillers_phone,
                R.string.spillers_times));
        venueContents.add(new VenueContent(R.drawable.kellys, "Cardiff", R.string.kellys_name,
                R.string.kellys_hashtags, R.string.kellys_details, R.string.kellys_address, R.string.kellys_phone,
                R.string.kellys_times));

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