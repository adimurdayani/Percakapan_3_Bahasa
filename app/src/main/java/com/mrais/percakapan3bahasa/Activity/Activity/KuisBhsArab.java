package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mrais.percakapan3bahasa.Activity.Kuis.KuisBahasaArab;
import com.mrais.percakapan3bahasa.Activity.Kuis.KuisBahasaArab2;
import com.mrais.percakapan3bahasa.R;

public class KuisBhsArab extends AppCompatActivity {

    ImageView btn_kembali, btn_home;
    CardView btn_pilihanGanda, btn_essay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_bhs_arab);

        btn_kembali = findViewById(R.id.btn_kembali);
        btn_home = findViewById(R.id.btn_home);
        btn_essay = findViewById(R.id.btn_esai);
        btn_pilihanGanda = findViewById(R.id.btn_pilihan_ganda);

        btn_kembali.setOnClickListener(v -> {
            super.onBackPressed();
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBhsArab.this, MainActivity.class));

            }
        });

        btn_pilihanGanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBhsArab.this, KuisBahasaArab.class));

            }
        });

        btn_essay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBhsArab.this, KuisBahasaArab2.class));

            }
        });
    }
}
