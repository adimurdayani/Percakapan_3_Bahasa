package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.SharedLibraryInfo;
import android.graphics.Color;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.mrais.percakapan3bahasa.Activity.Adapter.SlideImageAdapter;
import com.mrais.percakapan3bahasa.Activity.Model.SlideItemImage;
import com.mrais.percakapan3bahasa.R;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SlideImageAdapter adapter;
    Button btnTutorial;
    CardView cdKuis, cdtentang, cdmateri, cdpercakapan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SliderView sliderView = findViewById(R.id.imageSlider);
        cdKuis = findViewById(R.id.cd_kuis);
        cdtentang = findViewById(R.id.cd_tentang);
        cdmateri = findViewById(R.id.cd_materi);
        cdpercakapan = findViewById(R.id.cd_percakapan);
        btnTutorial = findViewById(R.id.btn_tutorial);

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
        cdKuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Kuis.class));

            }
        });
        cdtentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Tentang.class));

            }
        });
        cdmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Materi.class));

            }
        });
        cdpercakapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Percakapan.class));

            }
        });
        btnTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Tutorial.class));

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

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Konfirmasi");
        builder.setMessage("Apakah anda ingin keluar?");
        builder.setCancelable(true);
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
