package com.example.android.nerdguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 *      This is a {@link FragmentPagerAdapter} that can provide each Venue list item based
 *      on a data source which is a {@link VenueContent} object
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragments state across wipes
     *
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for a given page
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BoardGamesFragment();
        } else if (position == 1){
            return new VideoGamesFragment();
        } else if (position == 2){
            return new ComicsFragment();
        } else {
            return new VinylFragment();
        }
    }

    /**
     *Return the total number of pages
     */

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_board_games);
        } else if (position == 1) {
            return mContext.getString(R.string.category_video_games);
        } else if (position == 2) {
            return mContext.getString(R.string.category_comics);
        } else {
            return mContext.getString(R.string.category_vinyl);
        }
    }
}
