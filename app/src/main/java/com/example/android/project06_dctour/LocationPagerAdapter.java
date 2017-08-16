package com.example.android.project06_dctour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by louis on 8/15/17.
 */

public class LocationPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    //Public constructor for the ViewPager Adapter
    public LocationPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MuseumFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new NightlifeFragment();
            case 3:
                return new PopularFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        //Returns the number of items of the Viewpager
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Set the titles of the tabs for the TabLayout
        if (position == 0){
            return mContext.getString(R.string.museum);
        }
        else if (position == 1){
            return mContext.getString(R.string.food);
        }
        else if (position == 2){
            return mContext.getString(R.string.nightlife);
        }
        else {
            return mContext.getString(R.string.popular);
        }
    }
}