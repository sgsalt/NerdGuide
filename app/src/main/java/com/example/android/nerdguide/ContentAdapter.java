package com.example.android.nerdguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link ContentAdapter} is an {@link ArrayAdapter} that can provide the layout for each venue item
 * based on the data source laid out in the {@link VenueContent} custom class.
 */

public class ContentAdapter extends ArrayAdapter<VenueContent> {

    // Resource ID for the background colour for this Venue list
    private int mColorResourceId;

    /** Create a new {@link ContentAdapter}object
     *
     * @param context is the activity that the adapter is being created in.
     * @param venues is the list of {@link VenueContent} to be displayed.
     * @param colorResourceId is the beackground colour for this list of venues
     * */
    public ContentAdapter (Context context, ArrayList<VenueContent> venues, int colorResourceId) {
        super(context, 0, venues);
        mColorResourceId = colorResourceId;
    }

    /** Create the layout inflater and optimise so that offscreen views are removed */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused and if not, inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.venue_list, parent, false);
        }

        // Get the VenueContent object located at this position in the list
        VenueContent currentVenue = getItem(position);

        //Find the ImageView in the venue_item.xml layout file with the ID venue_image
        ImageView imageView = listItemView.findViewById(R.id.venue_image);
        // Check if an image is provided for this word or not
        if (currentVenue.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentVenue.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        //Find the TextView in the venue_item.xml layout file with the ID venue_location_text
        TextView locationTextView = listItemView.findViewById(R.id.venue_location_text);
            //Get the text from the currentVenue object and set it on the location TextView
        locationTextView.setText(currentVenue.getVenueLocation());

        //Find the TextView in the venue_item.xml layout file with the ID venue_location_name
        TextView venueNameTextView = listItemView.findViewById(R.id.venue_name);
            //Get the text from the currentVenue object and set it on the name TextView
        venueNameTextView.setText(currentVenue.getVenueName());

        //Find the TextView in the venue_item.xml layout file with the ID venue_details
        TextView venueDetailsTextView = listItemView.findViewById(R.id.venue_details);
            //Get the text from the currentVenue object and set it on the name TextView
        venueDetailsTextView.setText(currentVenue.getVenueDetails());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.item_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout to be displayed in the ListView
        return listItemView;
    }
}
