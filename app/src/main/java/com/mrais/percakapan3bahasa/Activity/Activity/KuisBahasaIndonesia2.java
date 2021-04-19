package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mrais.percakapan3bahasa.Activity.Kuis.KuisBahasaInggris;
import com.mrais.percakapan3bahasa.Activity.Kuis.KuisBahasaInggris2;
import com.mrais.percakapan3bahasa.R;

public class KuisBahasaIndonesia2 extends AppCompatActivity {

    ImageView btn_kembali, btn_home;
    CardView btn_pilihanGanda, btn_essay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_bahasa_indonesia2);

        btn_kembali = findViewById(R.id.btn_kembali);
        btn_home = findViewById(R.id.btn_home);
        btn_pilihanGanda = findViewById(R.id.btn_pilihan_ganda);
        btn_essay = findViewById(R.id.btn_esai);

        btn_kembali.setOnClickListener(v -> {
            super.onBackPressed();
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBahasaIndonesia2.this, MainActivity.class));

            }
        });

        btn_pilihanGanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBahasaIndonesia2.this, KuisBahasaInggris.class));

            }
        });

        btn_essay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBahasaIndonesia2.this, KuisBahasaInggris2.class));

            }
        });
    }


}
