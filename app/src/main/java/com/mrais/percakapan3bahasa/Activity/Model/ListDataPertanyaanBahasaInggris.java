package com.mrais.percakapan3bahasa.Activity.Model;

public class ListDataPertanyaanBahasaInggris {
    public String pertanyaan[] = {
            "Adam’s Diary\n" +
                    "May 2010\n" +
                    "\n" +
                    "23 Sunday. When I got up, I felt ill, I went back to bed. Mum called the doctor. But he\n" +
                    "\n" +
                    "\n" +
                    "couldn’t come, because he was ill too.\n" +
                    "\n" +
                    "24 Monday. The doctor come at 11 O’clock. He wrote a prescription for some medicine.\n" +
                    "Mum bought it in the drugstore. It was horrible. Yuck!\n" +
                    "25 Tuesday. Dad bought me model aeroplane. I read the instructions, but I couldn’t make it,\n" +
                    "because the dog ate the glue.\n" +
                    "What happened at 23rd May to Adam?",
            "Adam’s Diary\n" +
                    "May 2010\n" +
                    "\n" +
                    "23 Sunday. When I got up, I felt ill, I went back to bed. Mum called the doctor. But he\n" +
                    "\n" +
                    "\n" +
                    "couldn’t come, because he was ill too.\n" +
                    "\n" +
                    "24 Monday. The doctor come at 11 O’clock. He wrote a prescription for some medicine.\n" +
                    "Mum bought it in the drugstore. It was horrible. Yuck!\n" +
                    "25 Tuesday. Dad bought me model aeroplane. I read the instructions, but I couldn’t make it,\n" +
                    "because the dog ate the glue.\n" +
                    "Who called the doctor?",
            "Adam’s Diary\n" +
                    "May 2010\n" +
                    "\n" +
                    "23 Sunday. When I got up, I felt ill, I went back to bed. Mum called the doctor. But he\n" +
                    "\n" +
                    "\n" +
                    "couldn’t come, because he was ill too.\n" +
                    "\n" +
                    "24 Monday. The doctor come at 11 O’clock. He wrote a prescription for some medicine.\n" +
                    "Mum bought it in the drugstore. It was horrible. Yuck!\n" +
                    "25 Tuesday. Dad bought me model aeroplane. I read the instructions, but I couldn’t make it,\n" +
                    "because the dog ate the glue.\n" +
                    "What did the doctor write at 24th?",
            "Adam’s Diary\n" +
                    "May 2010\n" +
                    "\n" +
                    "23 Sunday. When I got up, I felt ill, I went back to bed. Mum called the doctor. But he\n" +
                    "\n" +
                    "\n" +
                    "couldn’t come, because he was ill too.\n" +
                    "\n" +
                    "24 Monday. The doctor come at 11 O’clock. He wrote a prescription for some medicine.\n" +
                    "Mum bought it in the drugstore. It was horrible. Yuck!\n" +
                    "25 Tuesday. Dad bought me model aeroplane. I read the instructions, but I couldn’t make it,\n" +
                    "because the dog ate the glue.\n" +
                    "Adam could not make the aeroplane, why? Because...",
            "Read the text to answer question \n" +
                    "Last holiday I went to Paris. I visited museums and sat in public gardens. A friendly waiter taught me a few words of French. Then he lent me a book. I read a few lines, but I did not understand a word. Everyday I thought about postcards. My holidays passed quickly, but I did not send any cards to my friends. On the last day I made a big decision, I got up early and bought thirty seven cards. I spent the whole day in my room, but I did not write a single card!\n" +
                    "\nWhat is the text about?",
            "Read the text to answer question \n" +
                    "Last holiday I went to Paris. I visited museums and sat in public gardens. A friendly waiter taught me a few words of French. Then he lent me a book. I read a few lines, but I did not understand a word. Everyday I thought about postcards. My holidays passed quickly, but I did not send any cards to my friends. On the last day I made a big decision, I got up early and bought thirty seven cards. I spent the whole day in my room, but I did not write a single card!\n" +
                    "What is the generic structure (tenses) of the text above?",
            "Read the text to answer question \n" +
                    "Last holiday I went to Paris. I visited museums and sat in public gardens. A friendly waiter taught me a few words of French. Then he lent me a book. I read a few lines, but I did not understand a word. Everyday I thought about postcards. My holidays passed quickly, but I did not send any cards to my friends. On the last day I made a big decision, I got up early and bought thirty seven cards. I spent the whole day in my room, but I did not write a single card!\n" +
                    "Whom did the writer meet in Paris?",
            "Read the text to answer question \n" +
                    "Last holiday I went to Paris. I visited museums and sat in public gardens. A friendly waiter taught me a few words of French. Then he lent me a book. I read a few lines, but I did not understand a word. Everyday I thought about postcards. My holidays passed quickly, but I did not send any cards to my friends. On the last day I made a big decision, I got up early and bought thirty seven cards. I spent the whole day in my room, but I did not write a single card!\n" +
                    "What was the first place the writer visited?",
            "‘I read a few lines, ...’\n" +
                    "What does the underlined phrase mean?\n",
            "Last week I .......(1) my grandmother’s house. I .......(2) public transportation to reach the house. On the trip, I .......(3) so many beautiful scenery there. My grandmother greet me, when I ......(4) her house. She looked so glad. She .....(5) me her delicious food, then we...........(6) together." +
                    "\nThe suitable word for number 1 is..."
    };
    public String pilihanJawaban[][] = {
            {"He couldn’t come", "He wrote a prescription","He felt ill","He was slipping"},
            {"Father","Adam","Mother","Doctor"},
            {"Instructions","Model aeroplane","Address of drugstore","Prescription"},
            {"He felt ill","The dog ate the glue","The doctor was ill too","Mum bought medicine"},
            {"Visiting museum","Postcard","Words of French","Holiday"},
            {"Simple present tense","Simple past tense","Present continues tense","Simple future tense"},
            {"Friendly waiter","His friends","Postman","Mother"},
            {"Museum","Public garden","His room","Post office"},
            {"Words in a postcard","Text on the book","Museum guiding","Garden’s rules"},
            {"go to","goes to","went to","gone to"}
    };

    public String jawabanBenar[]={
            "He felt ill",
            "Mother",
            "Prescription",
            "The dog ate the glue",
            "Holiday",
            "Simple past tense",
            "Friendly waiter",
            "Museum",
            "Text on the book",
            "went to"
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
