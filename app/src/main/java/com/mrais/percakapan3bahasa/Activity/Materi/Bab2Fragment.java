package com.mrais.percakapan3bahasa.Activity.Materi;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mrais.percakapan3bahasa.Activity.Activity.MainActivity;
import com.mrais.percakapan3bahasa.Activity.Activity.Materi;
import com.mrais.percakapan3bahasa.Activity.Activity.Materi1;
import com.mrais.percakapan3bahasa.R;


public class Bab2Fragment extends Fragment {

    ImageView btn_kembali, btn_home;

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_bab2, container, false);

        btn_kembali = fragment.findViewById(R.id.btn_kembali);
        btn_home = fragment.findViewById(R.id.btn_home);

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
