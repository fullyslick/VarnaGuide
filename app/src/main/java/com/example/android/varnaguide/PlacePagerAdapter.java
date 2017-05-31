package com.example.android.varnaguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by AR on 29.5.2017 г..
 */

public class PlacePagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private String tabTitles[] = new String[] { "Sights", "Museums", "Food", "Bars" };

    //Public constructor for the ViewPager Adapter
    public PlacePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        //Set the Fragments as ViewPager items
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new BarFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
