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
public class VideoGamesFragment extends Fragment {


    public VideoGamesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.venue_list, container, false);

        //Create the venue array
        final ArrayList<VenueContent> venueContents = new ArrayList<>();
        venueContents.add(new VenueContent(R.drawable.retro_toys, "Cardiff", R.string.chance_and_counters_name,R.string.chance_details ));

        // Create a ContentAdapter whose data source is the list of venues.
        ContentAdapter adapter = new ContentAdapter(getActivity(), venueContents, R.color.colorAccent);

        //Find the ListView object in the view hierarchy, The ListView called list is
        // declared in the venue_list.xml layout file
        ListView listView = rootView.findViewById(R.id.list);

        //Set the ListView on the ContentAdapter created above
        listView.setAdapter(adapter);

        return rootView;

    }

}