package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mrais.percakapan3bahasa.Activity.Kuis.KuisBahasaIndo1;
import com.mrais.percakapan3bahasa.Activity.Kuis.KuisBahasaIndo2;
import com.mrais.percakapan3bahasa.R;

public class KuisBahasaIndonesia extends AppCompatActivity {

    ImageView btn_kembali, btn_home;
    CardView btn_pilihanganda, btn_essay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_bahasa_indonesia);

        btn_kembali = findViewById(R.id.btn_kembali);
        btn_home = findViewById(R.id.btn_home);
        btn_pilihanganda = findViewById(R.id.btn_pilihan_ganda);
        btn_essay = findViewById(R.id.btn_esai);

        btn_kembali.setOnClickListener(v -> {
            super.onBackPressed();
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBahasaIndonesia.this, MainActivity.class));

            }
        });

        btn_essay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBahasaIndonesia.this, KuisBahasaIndo2.class));

            }
        });
        btn_pilihanganda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBahasaIndonesia.this, KuisBahasaIndo1.class));

            }
        });
    }

}
