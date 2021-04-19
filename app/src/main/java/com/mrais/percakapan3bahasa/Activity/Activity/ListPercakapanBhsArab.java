package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab10;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab2;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab3;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab4;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab5;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab6;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab7;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab8;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab9;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaInggris;
import com.mrais.percakapan3bahasa.R;

public class ListPercakapanBhsArab extends AppCompatActivity {

    ImageView btn_kembali, btn_home;

    private CardView btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_percakapan_bhs_arab);
        init();
    }

    private void init() {
        btn_home = findViewById(R.id.btn_home);
        btn_kembali = findViewById(R.id.btn_kembali);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);

        btn_1.setOnClickListener(v -> {
            startActivity(new Intent(ListPercakapanBhsArab.this, PercakapanBahasaArab.class));
        });
        btn_2.setOnClickListener(v -> {

            startActivity(new Intent(ListPercakapanBhsArab.this, PercakapanBahasaArab2.class));
        });
        btn_3.setOnClickListener(v -> {
            startActivity(new Intent(ListPercakapanBhsArab.this, PercakapanBahasaArab3.class));
        });
        btn_4.setOnClickListener(v -> {

            startActivity(new Intent(ListPercakapanBhsArab.this, PercakapanBahasaArab4.class));
        });
        btn_5.setOnClickListener(v -> {
            startActivity(new Intent(ListPercakapanBhsArab.this, PercakapanBahasaArab5.class));
        });


        btn_home.setOnClickListener(v -> {
            startActivity(new Intent(ListPercakapanBhsArab.this, MainActivity.class));
            finish();
        });
        btn_kembali.setOnClickListener(v -> {
            onBackPressed();
        });
    }
}
