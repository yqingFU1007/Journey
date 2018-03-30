package com.example.android.journey;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by apple on 2018/3/29.
 */

public class CategoryAdapter extends FragmentPagerAdapter{
    private Context mContext;

    public CategoryAdapter (FragmentManager fragmentManager, Context context){
        super(fragmentManager);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new XianFragment();
        }
        else if (position == 1){
            return new BeijingFragment();
        }
        else if (position == 2){
            return new ChengduFragment();
        }
        else {
            return new XiamenFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.xian);
        }
        else if (position == 1){
            return mContext.getString(R.string.beijing);
        }
        else if (position == 2){
            return mContext.getString(R.string.shanghai);
        }
        else {
            return mContext.getString(R.string.nanjing);
        }
    }
}
