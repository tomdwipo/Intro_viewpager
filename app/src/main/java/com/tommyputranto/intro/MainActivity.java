package com.tommyputranto.intro;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tommyputranto.intro.adapter.ScreenSlidePagerAdapter;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    private PagerAdapter mPagerAdapter;
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        circleIndicator = (CircleIndicator)findViewById(R.id.circleIndicator);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mPagerAdapter);
        circleIndicator.setViewPager(viewPager);
    }
}
