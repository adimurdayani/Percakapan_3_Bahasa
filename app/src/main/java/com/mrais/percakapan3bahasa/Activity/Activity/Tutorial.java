package com.mrais.percakapan3bahasa.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.baoyachi.stepview.VerticalStepView;
import com.mrais.percakapan3bahasa.R;

import java.util.ArrayList;
import java.util.List;

public class Tutorial extends AppCompatActivity {

    ImageView btnKembali;
    VerticalStepView verticalStepView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        btnKembali = findViewById(R.id.img_tutorial);
        verticalStepView = findViewById(R.id.stepperviewtutorial);

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tutorial.super.onBackPressed();
            }
        });

        List<String> listStep = new ArrayList<>();
        listStep.add("Menu materi"+"\n\nMenu materi adalah menu yang digunakan untuk mengakses materi bahasa indonesia, bahasa inggris dan bahasa arab.");
        listStep.add("Menu percakapan"+"\n\nMenu percakapan adalah menu yang digunakan untuk mengakses percakapan dari bahasa indonesia, bahasa inggris dan bahasa arab.");
        listStep.add("Menu kuis"+"\n\nMenu kuis adalah menu yang digunakan untuk mengakses kuis dari bahasa indonesia, bahasa inggris dan bahasa arab. Di dalam setiap halaman bahasa terdapat kuis pilihan ganda dan kuis essay");
        listStep.add("Menu tentang"+"\n\nMenu tentang adalah menu yang digunakan untuk mengakses biodata pembuat aplikasi ini");
        listStep.add("Selesai");
        verticalStepView.setStepsViewIndicatorComplectingPosition(listStep.size())
                .reverseDraw(false)
                .setStepViewTexts(listStep)
                .setLinePaddingProportion(2.65f)
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_green_light))
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(getApplicationContext(), R.color.uncompleted_text_color))
                .setStepViewComplectedTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.black))
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(getApplicationContext(), R.color.uncompleted_text_color))
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.complted))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.default_icon))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(getApplicationContext(), R.drawable.attention));
    }
}
