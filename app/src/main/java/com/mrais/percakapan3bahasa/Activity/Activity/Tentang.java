package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mrais.percakapan3bahasa.R;

import java.util.regex.Pattern;

public class Tentang extends AppCompatActivity {

    ImageView btnKembali;
    TextView text_facebook_tentang, text_instagram, text_whatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        btnKembali = findViewById(R.id.btn_kembali_tentang);
        text_facebook_tentang = findViewById(R.id.text_facebook_tentang);
        text_instagram = findViewById(R.id.text_instagram);
        text_whatsapp = findViewById(R.id.text_whatsapp);

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tentang.super.onBackPressed();
            }
        });

        Pattern pattern1 = Pattern.compile("[a-zA-Z]+&");
        text_facebook_tentang.setText("Facebook&");
        Linkify.addLinks(text_facebook_tentang, pattern1, "https://web.facebook.com/tria.f.ii.5/?_rdc=1&_rdr");

        Pattern pattern2 = Pattern.compile("[a-zA-Z]+&");
        text_instagram.setText("Instagram&");
        Linkify.addLinks(text_instagram, pattern2, "https://www.instagram.com/octrmailue/?_rdc=1&_rdr");

        Pattern pattern3 = Pattern.compile("[a-zA-Z]+&");
        text_whatsapp.setText("Whatsapp&");
        Linkify.addLinks(text_whatsapp, pattern3, "https://api.whatsapp.com/send?phone=6281241408797");
    }
}
