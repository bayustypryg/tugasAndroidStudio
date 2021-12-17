package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JawabaratFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JawabaratFragment extends Fragment {

    private TextView garut, bandung, sumedang;

    public  JawabaratFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jawabarat, container, false);

        garut = view.findViewById(R.id.garut);
        garut.setText("Kabupaten Garut");

        bandung = view.findViewById(R.id.bandung);
        bandung.setText("Kabupaten Ggarut");

        sumedang = view.findViewById(R.id.sumedang);
        sumedang.setText("Kabupaten Ggarut");

        return view;

    }
}