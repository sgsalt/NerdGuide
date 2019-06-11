package com.example.android.nerdguide;


/** This is the custom class for Venue content in the Fragments
 * Contains an image, location, venue name and description
 */

public class VenueContent {

    // Image resource ID for the venue
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    // Location (city) of the venue
    private String mVenueLocation;

    // Name of the venue
    private int mVenueName;

    // Details about the venue
    private int mVenueDetails;

    /**
     * Creates the new Venue content object.
     *
     * @param venueLocation is the city where the venue is located
     * @param venueName     is the name of the venue
     * @param venueDetails  is details about the location such as what you can do there,
     *                      what it sells, or why it's of interest to nerds.
     */
    public VenueContent(int imageResourceId, String venueLocation, int venueName, int venueDetails) {
        mImageResourceId = imageResourceId;
        mVenueLocation = venueLocation;
        mVenueName = venueName;
        mVenueDetails = venueDetails;
    }

    /**
     * Set methods for the VenueContent custom class
     */

    // Get the correct image for the venue
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Get the venue location
    public String getVenueLocation() {
        return mVenueLocation;
    }

    // Get the venue name
    public int getVenueName() {
        return mVenueName;
    }

    // Get the venue details
    public int getVenueDetails() {
        return mVenueDetails;
    }

    /** Returns whether or not there is an image for this venue */
    public boolean hasImage (){ return mImageResourceId != NO_IMAGE_PROVIDED; }

}