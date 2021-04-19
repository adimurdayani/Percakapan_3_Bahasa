package com.mrais.percakapan3bahasa.Activity.Kuis;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mrais.percakapan3bahasa.Activity.Activity.Kuis;
import com.mrais.percakapan3bahasa.Activity.Activity.KuisBahasaIndonesia;
import com.mrais.percakapan3bahasa.Activity.Activity.MainActivity;
import com.mrais.percakapan3bahasa.R;

public class HasilKuisBhasaIndonesia extends AppCompatActivity {

    TextView tv_hasilAkhir;
    CardView btn_kembali, btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis_bhasa_indonesia);

        tv_hasilAkhir = findViewById(R.id.tv_skorAkhir);
        btn_kembali = findViewById(R.id.btn_kembali);
        btn_home = findViewById(R.id.btn_home);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HasilKuisBhasaIndonesia.this, MainActivity.class));
                finish();
            }
        });

        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HasilKuisBhasaIndonesia.super.onBackPressed();
            }
        });
        setSkor();
    }

    public void setSkor() {
        String activity = getIntent().getStringExtra("activity");
        String SkorpilGan = getIntent().getStringExtra("skorAkhir");
        String skorEssay = getIntent().getStringExtra("skorAkhir2");
        if (activity.equals("PilihanGanda")) {
            tv_hasilAkhir.setText("SKOR: " + SkorpilGan);
        } else {
            tv_hasilAkhir.setText("SKOR: " + skorEssay);
        }
    }

}
