package com.mrais.percakapan3bahasa.Activity.Model;

public class ListDataSoalEssayBahasaInggris {
    public String pertanyaan[]={
            "Apa arti Bahasa Inggris dari kata 'Kelas'?",
            "Apa arti Bahasa Inggris dari kata 'Meja'?",
            "Apa arti Bahasa Inggris dari kata 'Laci'?",
            "Apa arti Bahasa Inggris dari kata 'Loker'?",
            "Apa arti Bahasa Inggris dari kata 'Kursi'?"
    };
    public String jawaban[]={
            "Class",
            "Table",
            "Drawer",
            "Locker",
            "Chair"
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
