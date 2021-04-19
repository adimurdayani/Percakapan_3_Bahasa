package com.mrais.percakapan3bahasa.Activity.Model;

public class ListDataSoalEssayBahasaIndo {

    public String pertanyaan[]={
            "Sebutkan antonim dari kata 'jauh'?",
            "Sebutkan antonim dari kata 'diam'?",
            "Sebutkan antonim dari kata 'suami'?",
            "Sebutkan antonim dari kata 'jendral'?",
            "Sebutkan antonim dari kata 'cantik'?"
    };
    public String jawaban[]={
            "Dekat",
            "Bergerak",
            "Istri",
            "Kapten",
            "Jelek"
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
