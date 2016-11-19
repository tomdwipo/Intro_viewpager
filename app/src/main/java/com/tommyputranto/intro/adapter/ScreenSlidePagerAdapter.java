package com.tommyputranto.intro.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tommyputranto.intro.fragment.ScreenSlideFragment1;
import com.tommyputranto.intro.fragment.ScreenSlideFragment2;

/**
 * Created by gits on 11/19/16.
 */


public class ScreenSlidePagerAdapter  extends FragmentPagerAdapter {



    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //method ini yang akan memanipulasi penampilan Fragment dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new ScreenSlideFragment1();
                break;
            case 1:
                fragment = new ScreenSlideFragment2();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }
    // ini jumlah slide nya
    @Override
    public int getCount() {
        return 2;
    }
}