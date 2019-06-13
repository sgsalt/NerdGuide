package com.example.android.nerdguide;


/** This is the custom class for Venue content in the Fragments
 * Contains an image, location, venue name and description
 */

public class VenueContent {

    // Image resource ID for the venue
    private int mImageResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    // Location (city) of the venue
    private String mVenueLocation;

    // Name of the venue
    private int mVenueName;

    // Venue hash tags
    private int mVenueHashtags;

    // Details about the venue
    private int mVenueDetails;

    // Address of the venue
    private int mVenueAdress;

    // Venue phone number
    private int mVenuePhone;

    // Opening times of the venue
    private int mOpeningTimes;

    /**
     * Creates the new Venue content object.
     *
     * @param venueLocation is the city where the venue is located
     * @param venueName     is the name of the venue
     * @param venueHashtags hashtags to identify topics of interest to nerds.
     * @param venueDetails  is details about the location such as what you can do there,
     *                      what it sells, or why it's of interest to nerds.
     * @param venueAddress  the address of the venue.
     * @param venuePhone    phone number of the venue.
     * @param openingTimes  the venues opening hours.
     *
     */
    public VenueContent(int imageResourceId, String venueLocation, int venueName, int venueHashtags,
                        int venueDetails, int venueAddress, int venuePhone, int openingTimes) {
        mImageResourceId = imageResourceId;
        mVenueLocation = venueLocation;
        mVenueName = venueName;
        mVenueHashtags = venueHashtags;
        mVenueDetails = venueDetails;
        mVenueAdress = venueAddress;
        mVenuePhone = venuePhone;
        mOpeningTimes = openingTimes;
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

    // Get the venue hashtags
    public int getVenueHashtags() {
        return mVenueHashtags;
    }

    // Get the venue details
    public int getVenueDetails() {
        return mVenueDetails;
    }

    // Get the venue address
    public int getVenueAddress() {
        return mVenueAdress;
    }

    // Get the venue phone number
    public int getVenuePhone() {
        return mVenuePhone;
    }

    // Get the venue opening times
    public int getOpeningTimes() {
        return mOpeningTimes;
    }

    /** Returns whether or not there is an image for this venue */
    public boolean hasImage (){ return mImageResourceId != NO_IMAGE_PROVIDED; }

}