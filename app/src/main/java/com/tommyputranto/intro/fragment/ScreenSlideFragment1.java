package com.tommyputranto.intro.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tommyputranto.intro.R;


/**
 * Created by gits on 11/19/16.
 */

public class ScreenSlideFragment1 extends Fragment {

    public ScreenSlideFragment1() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.screen_slide_fragment1, container, false);
    }

}
