package com.example.android.nerdguide;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of this activity to use the activity_main.xml layout resource file
        setContentView(R.layout.activity_main);

        // Get the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        //Create an adapter which knows which fragment to show on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter on the viewPager
        viewPager.setAdapter(adapter);

        //Find the tab layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout to the view pager
        //  1. Update the tab layout when the view pager is swiped
        //  2. Update the view pager when a tab is selected
        //  3. Set the tab names to the view pager adapter names by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
}
