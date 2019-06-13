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
        venueContents.add(new VenueContent(R.drawable.super_tomato, "Cardiff", R.string.super_tomato_name,
                R.string.super_tomato_hashtags, R.string.super_tomato_details, R.string.super_tomato_address,
                R.string.super_tomato_phone, R.string.super_tomato_times));
        venueContents.add(new VenueContent(R.drawable.kongs, "Cardiff", R.string.kongs_name,
                R.string.kongs_hashtags, R.string.kongs_details, R.string.kongs_address, R.string.kongs_phone,
                R.string.kongs_times));
        venueContents.add(new VenueContent(R.drawable.arcade_vaults, "Cardiff", R.string.arcade_vaults_name,
                R.string.arcade_vaults_hashtags, R.string.arcade_vaults_details, R.string.arcade_vaults_address,
                R.string.arcade_vaults_phone, R.string.arcade_vaults_times));

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