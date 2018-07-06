package com.ufg2018.climaorganizacional.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ufg2018.climaorganizacional.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FiltroFragment extends Fragment {


    public FiltroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_filtro, container, false);
    }

}
