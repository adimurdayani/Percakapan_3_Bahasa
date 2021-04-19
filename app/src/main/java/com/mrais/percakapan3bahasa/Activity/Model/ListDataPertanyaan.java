package com.mrais.percakapan3bahasa.Activity.Model;

public class ListDataPertanyaan {

    public String pertanyaan[] = {
            "Kamis (31/1) timnas sepak bola kalah 0-5 dari Yordania pada laga uji coba. Meski timnas kalah, Menpora menegaskan masih memercayai PSSI untuk timnas. Sebelumnya, ada permintaan dari KPSI supaya pengelolaan timnas dipercayakan pada pihak ketiga. Jika kinerja PSSI dinilai kurang dalam menangani timnas, Menpora berjanji segera mengambil tindakan." +
                    "\nKutipan teks berita di atas terdapat struktur teks berita bagian ...",
            "Kalimat dalam iklan yang mengandung maksud perintah atau meminta orang lain melakukan yang diminta disebut ...",
            "1.\tMembaca berbagai sumber yang berkaitan dengan isu yang dipilih\n" +
                    "2.\tMenentukan isu atau masalah yang akan dibahas\n" +
                    "3.\tMendaftar topik-topik yang berkaitan dengan isu yang akan dibahas\n" +
                    "Urutan langkah yang tepat dalam merencanakan penyusunan teks eksposisi adalah ...\n",
            "Kebiasaan mencamil tanpa kenal waktu akan sangat berpengaruh terhadap kesehatan dan berat badan, terutama jika makanan yang dikonsumsi adalah roti, kue kering, gorengan, atau makanan yang manis-manis. Oleh karena itu, kebiasaan tersebut harus segera dihentikan. Jika tidak bisa benar-benar berhenti, kita bisa banting setir dengan mencamil makanan rendah kalori atau buah-buahan. \n" +
                    "Kebahasaan teks eksposisi yang terdapat dalam kalimat ketiga teks tersebut adalah ...  \n",
            "Bacalah kutipan puisi berikut!\n" +
                    " \n" +
                    "Senja di Pelabuhan Kecil\n" +
                    "Karya: Chairil Anwar\n" +
                    "Buat Sri Ajati\n" +
                    " \n" +
                    "Ini kali tidak ada yang mencari cinta\n" +
                    "di antara gudang, rumah tua, pada cerita tiang serta temali.\n" +
                    "Kapal, perahu tidak berlaut, menghembus diri\n" +
                    "dalam mempercaya mau berpaut\n" +
                    " \n" +
                    "Unsur yang menonjol dalam kutipan puisi tersebut adalah .... \n",
            "Dibawah yang termasuk kedalam fungsi dari sebuah judul adalah, kecuali...",
            "Yang termasuk ke dalam jenis softnews adalah …",
            "Suatu informasi baru yang diinformasikan melalui koran, majalah, telivisi dan alat-alat media lainnya disebut …",
            "Syarat yang harus dipenuhi dalam penyusunan sebuah berita, kecuali …",
            "Perhatikan teks berikut\n" +
                    "Butuh dana cepat? Proses cepat cukup memakai BPKB …..\n" +
                    "Pelengkap iklan baris tersebut yang paling tepat adalah..\n"
    };

    public String pilihanJawaban[][] = {
            {"kepala berita", "tubuh berita", "ekor berita", "pertengahan dan akhir berita"},
            {"kalimat interogatif", "kalimat deklaratif", "kalimat deskriptif", "kalimat imperatif"},
            {"1-2-3", "2-1-3", "3-2-1", "1-3-2"},
            {"kata persuasif tersirat", "konjungsi kausalitas", "kata konotasi", "kata perujukan"},
            {"persajakan dan rima", "tema","amanat","diksi"},
            {"Untuk Memberi kepadatan isi", "Merangkum isi cerita","Menserasikan/mempercantik perwajahan surat kabar","Melukiskan suasana berita"},
            {"Profil atau kisah kesuksesan seseorang","Editorial","Fotografer","Pencahayaan"},
            {"gosip","berita","iklan","promosi"},
            {"fiksi","aktual","berimbang","lengkap"},
            {"Hub. Saprol, Gang Kebo No. 31", "Telepon Haji Sobirin kapan saja","Hub. 085809904533","Cari alamat berikut. Subur makmur. Bandar Lampung City."}
    };

    public String jawabanBenar[] = {
            "kepala berita",
            "kalimat imperatif",
            "2-1-3",
            "kata konotasi",
            "diksi",
            "Untuk Memberi kepadatan isi",
            "Profil atau kisah kesuksesan seseorang",
            "berita",
            "fiksi",
            "Hub. 085809904533"
    };

    public String getPertanyaan(int x) {
        String soal = pertanyaan[x];
        return soal;
    }

    public String getPilihanJawaban1(int x) {
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
}

    public String getPilihanJawaban2(int x) {
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x) {
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    public String getPilihanJawaban4(int x) {
        String jawaban4 = pilihanJawaban[x][3];
        return jawaban4;
    }

    public String getJawabanBenar(int x) {
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
