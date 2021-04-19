package com.mrais.percakapan3bahasa.Activity.Model;

public class ListDataSoalEssayBahasaArab {

    public String pertanyaan[]={
            "Artikan kata 'كِتَابٌ' Kitaabun dalam bahasa Indonesia?",
            "Artikan kata 'غُرْفَةٌ' Ghurfatun dalam bahasa Indonesia?",
            "Artikan kata 'غُرْفَةُ النَّوْمِ' Ghurfatun naumi dalam bahasa Indonesia?",
            "Artikan kata 'فِرَاشٌ' Firoosyun dalam bahasa Indonesia?",
            "Artikan kata 'وِسَادَةٌ' Wisaadatun dalam bahasa Indonesia?"
    };
    public String jawaban[]={
            "Buku",
            "Kamar",
            "Kamar tidur",
            "Kasur",
            "Bantal"
    };

    public String getPertanyaan(int x) {
        String soal = pertanyaan[x];
        return soal;
    }

    public String getJawaban(int x) {
        String jawabanBenar = jawaban[x];
        return jawabanBenar;
    }
}
