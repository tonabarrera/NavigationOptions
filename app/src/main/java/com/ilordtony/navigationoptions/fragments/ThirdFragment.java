package com.ilordtony.navigationoptions.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ilordtony.navigationoptions.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";


    public ThirdFragment() {
        // Required empty public constructor
    }

    public static ThirdFragment newInstance(int sectionNumber) {
        ThirdFragment fragment = new ThirdFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }


}
