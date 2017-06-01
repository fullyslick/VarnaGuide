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

    //Public constructor for the ViewPager Adapter
    public PlacePagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        //Set the Fragments as ViewPager items
        switch (position){
            case 0: return new SightsFragment();
            case 1: return new MuseumsFragment();
            case 2: return new RestaurantsFragment();
            default: return new BarFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position){
            case 0: return mContext.getString(R.string.sights);
            case 1: return mContext.getString(R.string.muesums);
            case 2: return mContext.getString(R.string.food);
            default: return mContext.getString(R.string.bars);
        }
    }
}
