package com.tommyputranto.intro.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.tommyputranto.intro.R;

/**
 * Created by gits on 11/19/16.
 */

public class ScreenSlideFragment2 extends Fragment{
    Button tesBtn;
    public ScreenSlideFragment2() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.screen_slide_fragment2, container, false);
        tesBtn = (Button)view.findViewById(R.id.tesBtn);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "tes toast", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
