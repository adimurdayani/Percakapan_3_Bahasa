package com.mrais.percakapan3bahasa.Activity.Percakapan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.mrais.percakapan3bahasa.Activity.Activity.MainActivity;
import com.mrais.percakapan3bahasa.R;

public class PercakapanBahasaArab10 extends AppCompatActivity {

    ImageView btn_kembali, btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percakapan_bahasa_arab10);
        init();
    }
    private void init() {
        btn_home.setOnClickListener(v -> {
            startActivity(new Intent(PercakapanBahasaArab10.this, MainActivity.class));
            finish();
        });
        btn_kembali.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}
