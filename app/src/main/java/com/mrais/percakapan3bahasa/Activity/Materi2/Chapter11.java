package com.mrais.percakapan3bahasa.Activity.Materi2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mrais.percakapan3bahasa.Activity.Activity.MainActivity;
import com.mrais.percakapan3bahasa.Activity.Activity.Materi;
import com.mrais.percakapan3bahasa.R;

public class Chapter11 extends Fragment {
    public Chapter11() {
        // Required empty public constructor
    }

    ImageView btn_next, btn_kembali, btn_home;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View fragment = inflater.inflate(R.layout.fragment_chapter11, container, false);

        btn_next = fragment.findViewById(R.id.btn_next);
        btn_kembali = fragment.findViewById(R.id.btn_kembali);
        btn_home = fragment.findViewById(R.id.btn_home);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(getActivity(), NextBab11.class));
            }
        });
        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), MainActivity.class));
                getActivity().finish();
            }
        });

        return fragment;
    }
}
