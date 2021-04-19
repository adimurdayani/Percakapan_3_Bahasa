package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mrais.percakapan3bahasa.Activity.Adapter.SlideImageAdapter;
import com.mrais.percakapan3bahasa.Activity.Kuis.KuisBahasaInggris;
import com.mrais.percakapan3bahasa.Activity.Model.SlideItemImage;
import com.mrais.percakapan3bahasa.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class Kuis extends AppCompatActivity {

    ImageView btn_kembali;
    LinearLayout btn_kuisbhsindo, btn_kuisbhsingris, btn_kuisbhsarab;
    private SlideImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        final SliderView sliderView = findViewById(R.id.imageSlider);

        btn_kembali = findViewById(R.id.btn_kembali);
        btn_kuisbhsindo = findViewById(R.id.btn_kuismateribahasaindo);
        btn_kuisbhsingris = findViewById(R.id.btn_kuismateribahasaingris);
        btn_kuisbhsarab = findViewById(R.id.btn_kuismateribahasaarab);

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
        btn_kembali.setOnClickListener(v -> {
            onBackPressed();
        });

        btn_kuisbhsindo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kuis.this, KuisBahasaIndonesia.class));

            }
        });

        btn_kuisbhsarab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kuis.this, KuisBhsArab.class));

            }
        });
        btn_kuisbhsingris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kuis.this, KuisBahasaIndonesia2.class));

            }
        });

        tampildataGambar();
    }

    public void tampildataGambar() {
        List<SlideItemImage> slideItemImage = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            SlideItemImage listitemImage = new SlideItemImage();
            listitemImage.setDeskripsi("Slider Item " + i);
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
