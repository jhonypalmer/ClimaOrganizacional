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
public class RelatorioFragment extends Fragment {


    public RelatorioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_relatorio, container, false);
    }

}
