package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mrais.percakapan3bahasa.Activity.Adapter.SlideImageAdapter;
import com.mrais.percakapan3bahasa.Activity.Model.SlideItemImage;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaArab;
import com.mrais.percakapan3bahasa.Activity.Percakapan.PercakapanBahasaInggris;
import com.mrais.percakapan3bahasa.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Percakapan extends AppCompatActivity {

    private SlideImageAdapter adapter;
    ImageView btn_kembali;
    LinearLayout btn_materibahasaindo, btn_materibahasaingris,
            btn_materibahasaarab, btn_percakapanbhsinggris, btn_percakapanbhsarab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percakapan);

        final SliderView sliderView = findViewById(R.id.imageSlider);

        btn_kembali = findViewById(R.id.btn_kembali);
        btn_materibahasaarab = findViewById(R.id.btn_bahasaarap);
        btn_materibahasaindo = findViewById(R.id.btn_materibahasaindo);
        btn_materibahasaingris = findViewById(R.id.btn_materibahasaingris);
        btn_percakapanbhsarab = findViewById(R.id.btn_soundbahasaarap);
        btn_percakapanbhsinggris = findViewById(R.id.btn_soundmateribahasaingris);

        adapter = new SlideImageAdapter(this);

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.DROP);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorSelectedColor(Color.GREEN);
        sliderView.setScrollTimeInSec(4);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();

        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                Log.i("GGG", "onIndicatorClicked: " + sliderView.getCurrentPagePosition());
            }
        });

        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Percakapan.super.onBackPressed();
            }
        });
        btn_materibahasaindo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Percakapan.this, Materi1.class));

            }
        });
        btn_materibahasaingris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Percakapan.this, Materi2.class));

            }
        });

        btn_materibahasaarab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Percakapan.this, Materi3.class));

            }
        });

        btn_percakapanbhsinggris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Percakapan.this, ListPercakapanBhsInggris.class));

            }
        });
        btn_percakapanbhsarab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Percakapan.this, ListPercakapanBhsArab.class));

            }
        });

        tampildataGambar();
    }

    public void tampildataGambar() {
        List<SlideItemImage> slideItemImage = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            SlideItemImage listitemImage = new SlideItemImage();
            if (i == 0) {
                listitemImage.setImg1(R.drawable.img_1);
            } else if (i == 1) {
                listitemImage.setImg1(R.drawable.img_2);
            } else if (i == 2) {
                listitemImage.setImg1(R.drawable.img_4);
            } else if (i == 3) {
                listitemImage.setImg1(R.drawable.img_3);
            }
            slideItemImage.add(listitemImage);
        }
        adapter.renewItems(slideItemImage);
    }

}
