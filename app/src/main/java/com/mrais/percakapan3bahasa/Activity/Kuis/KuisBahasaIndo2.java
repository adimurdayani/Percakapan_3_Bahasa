package com.mrais.percakapan3bahasa.Activity.Kuis;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mrais.percakapan3bahasa.Activity.Activity.Kuis;
import com.mrais.percakapan3bahasa.Activity.Activity.KuisBahasaIndonesia;
import com.mrais.percakapan3bahasa.Activity.Activity.MainActivity;
import com.mrais.percakapan3bahasa.Activity.Model.ListDataSoalEssayBahasaIndo;
import com.mrais.percakapan3bahasa.R;

public class KuisBahasaIndo2 extends AppCompatActivity {

    TextView tv_soalesay, tv_skorEssay;
    ImageView btn_kembali, btn_home;
    EditText edt_isijawaban;
    Button btn_kirimJawaban;
    int x = 0;
    int arr;
    int skor;
    String jawaban;
    ListDataSoalEssayBahasaIndo essay = new ListDataSoalEssayBahasaIndo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_bahasa_indo2);

        tv_soalesay = findViewById(R.id.tv_isisoalesay);
        edt_isijawaban = findViewById(R.id.edt_isijawaban);
        btn_kirimJawaban = findViewById(R.id.btn_jawab);
        tv_skorEssay = findViewById(R.id.tv_skoressay);
        btn_kembali = findViewById(R.id.btn_kembali);
        btn_home = findViewById(R.id.btn_home);

        btn_kirimJawaban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekJawaban();
            }
        });

        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KuisBahasaIndo2.super.onBackPressed();
            }
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBahasaIndo2.this, MainActivity.class));
                finish();
            }
        });
        setKontent();
    }

    public void setKontent() {
        edt_isijawaban.setText(null);
        arr = essay.pertanyaan.length;
        if (x >= arr) {
            String jumlahSkor = String.valueOf(skor);
            Intent i = new Intent(KuisBahasaIndo2.this, HasilKuisBhasaIndonesia.class);
            i.putExtra("skorAkhir2", jumlahSkor);
            i.putExtra("activity", "Essay");
            startActivity(i);
            finish();
        } else {
            tv_soalesay.setText(essay.getPertanyaan(x));
            jawaban = essay.getJawaban(x);
        }
        x++;
    }

    public void cekJawaban() {
        if (!edt_isijawaban.getText().toString().isEmpty()) {
            if (edt_isijawaban.getText().toString().equals(jawaban)) {
                skor = skor + 20;
                tv_skorEssay.setText("" + skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKontent();
            } else {
                tv_skorEssay.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKontent();
            }
        }
    }

}
