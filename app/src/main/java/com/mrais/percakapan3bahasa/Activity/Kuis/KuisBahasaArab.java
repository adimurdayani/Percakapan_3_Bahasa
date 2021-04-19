package com.mrais.percakapan3bahasa.Activity.Kuis;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mrais.percakapan3bahasa.Activity.Activity.KuisBahasaIndonesia;
import com.mrais.percakapan3bahasa.Activity.Activity.KuisBahasaIndonesia2;
import com.mrais.percakapan3bahasa.Activity.Activity.KuisBhsArab;
import com.mrais.percakapan3bahasa.Activity.Activity.MainActivity;
import com.mrais.percakapan3bahasa.Activity.Model.ListDataPertanyaan;
import com.mrais.percakapan3bahasa.Activity.Model.ListDataPertanyaanBhsArab;
import com.mrais.percakapan3bahasa.R;

public class KuisBahasaArab extends AppCompatActivity {

    ImageView btn_kembali, btn_home;
    TextView tvskor, tvsoal;
    RadioGroup radioGroup;
    RadioButton pilihanJawaban1, pilihanjawaban2, pilihanJawaban3, pilihanJawaban4;
    Button btn_pilihanJawban;

    int skor = 0;
    int arr;
    int x;
    String jawaban;

    ListDataPertanyaanBhsArab soal = new ListDataPertanyaanBhsArab();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_bahasa_arab);

        btn_home = findViewById(R.id.btn_home);
        btn_kembali = findViewById(R.id.btn_kembali);
        tvskor = findViewById(R.id.tvskor);
        tvsoal = findViewById(R.id.tvsoal);
        radioGroup = findViewById(R.id.groupPilihanJawaban);
        pilihanJawaban1 = findViewById(R.id.pilihanJawaban1);
        pilihanjawaban2 = findViewById(R.id.pilihanJawaban2);
        pilihanJawaban3 = findViewById(R.id.pilihanJawaban3);
        pilihanJawaban4 = findViewById(R.id.pilihanJawaban4);
        btn_pilihanJawban = findViewById(R.id.btn_pilih);

        tvskor.setText(""+skor);
        setKontent();

        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KuisBahasaArab.this, MainActivity.class));
                finish();
            }
        });

        btn_pilihanJawban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chekJawaban();
            }
        });
    }

    public void setKontent(){
        radioGroup.clearCheck();
        arr = soal.pertanyaan.length;
        if (x >= arr){
            String jumlahskor = String.valueOf(skor);
            Intent i = new Intent(KuisBahasaArab.this, HasilKuisBhasaIndonesia.class);
            i.putExtra("skorAkhir", jumlahskor);
            i.putExtra("activity", "PilihanGanda");
            startActivity(i);
            finish();
        }else{
            tvsoal.setText(soal.getPertanyaan(x));
            pilihanJawaban1.setText(soal.getPilihanJawaban1(x));
            pilihanjawaban2.setText(soal.getPilihanJawaban2(x));
            pilihanJawaban3.setText(soal.getPilihanJawaban3(x));
            pilihanJawaban4.setText(soal.getPilihanJawaban4(x));
            jawaban = soal.getJawabanBenar(x);
        }
        x++;
    }

    public void chekJawaban(){
        if (pilihanJawaban1.isChecked()){
            if (pilihanJawaban1.getText().toString().equals(jawaban)){
                skor = skor+10;
                tvskor.setText(""+skor);
                Toast.makeText(this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKontent();
            }else {
                tvskor.setText(""+skor);
                Toast.makeText(this,"Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKontent();
            }
        }else if (pilihanjawaban2.isChecked()){
            if (pilihanjawaban2.getText().toString().equals(jawaban)){
                skor = skor+10;
                tvskor.setText(""+skor);
                Toast.makeText(this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKontent();
            }else {
                tvskor.setText(""+skor);
                Toast.makeText(this,"Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKontent();
            }
        }else if (pilihanJawaban3.isChecked()){
            if (pilihanJawaban3.getText().toString().equals(jawaban)){
                skor = skor+10;
                tvskor.setText(""+skor);
                Toast.makeText(this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKontent();
            }else {
                tvskor.setText(""+skor);
                Toast.makeText(this,"Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKontent();
            }
        }else if (pilihanJawaban4.isChecked()){
            if (pilihanJawaban4.getText().toString().equals(jawaban)){
                skor = skor+10;
                tvskor.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKontent();
            }else {
                tvskor.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKontent();
            }
        }
    }


}
