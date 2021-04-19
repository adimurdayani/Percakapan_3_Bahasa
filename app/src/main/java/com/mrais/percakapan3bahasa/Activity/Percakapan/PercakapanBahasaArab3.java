package com.mrais.percakapan3bahasa.Activity.Percakapan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.mrais.percakapan3bahasa.Activity.Activity.MainActivity;
import com.mrais.percakapan3bahasa.R;

public class PercakapanBahasaArab3 extends AppCompatActivity {

    ImageView btn_kembali, btn_home;
    Button playBtn_1, playBtn_2, playBtn_3, playBtn_4, playBtn_5, playBtn_6, playBtn_7, playBtn_8, playBtn_9, playBtn_10, playBtn_11, playBtn_12, playBtn_13;
    SeekBar positionBar_1, positionBar_2, positionBar_3, positionBar_4, positionBar_5, positionBar_6, positionBar_7, positionBar_8, positionBar_9, positionBar_10, positionBar_11, positionBar_12, positionBar_13;
    TextView elapseTimeLabel_1, elapseTimeLabel_2, elapseTimeLabel_3, elapseTimeLabel_4, elapseTimeLabel_5, elapseTimeLabel_6, elapseTimeLabel_7, elapseTimeLabel_8, elapseTimeLabel_9, elapseTimeLabel_10, elapseTimeLabel_11, elapseTimeLabel_12, elapseTimeLabel_13;
    TextView remainingTimeLabel_1, remainingTimeLabel_2, remainingTimeLabel_3, remainingTimeLabel_4, remainingTimeLabel_5, remainingTimeLabel_6, remainingTimeLabel_7, remainingTimeLabel_8, remainingTimeLabel_9, remainingTimeLabel_10, remainingTimeLabel_11, remainingTimeLabel_12, remainingTimeLabel_13;
    MediaPlayer mp_1, mp_2, mp_3, mp_4, mp_5, mp_6, mp_7, mp_8, mp_9, mp_10, mp_11, mp_12, mp_13;
    int totalTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percakapan_bahasa_arab3);
        init();
    }

    private void init() {
        btn_home = findViewById(R.id.btn_home);
        btn_kembali = findViewById(R.id.btn_kembali);

//        play button
        playBtn_1 = (Button) findViewById(R.id.btnplay1);
        playBtn_2 = (Button) findViewById(R.id.btnplay2);
        playBtn_3 = (Button) findViewById(R.id.btnplay3);
        playBtn_4 = (Button) findViewById(R.id.btnplay4);
        playBtn_5 = (Button) findViewById(R.id.btnplay5);
        playBtn_6 = (Button) findViewById(R.id.btnplay6);
        playBtn_7 = (Button) findViewById(R.id.btnplay7);
        playBtn_8 = (Button) findViewById(R.id.btnplay8);
        playBtn_9 = (Button) findViewById(R.id.btnplay9);
        playBtn_10 = (Button) findViewById(R.id.btnplay10);
        playBtn_11 = (Button) findViewById(R.id.btnplay11);
        playBtn_12 = (Button) findViewById(R.id.btnplay12);
        playBtn_13 = (Button) findViewById(R.id.btnplay13);
//        end play button

//        elapsetimelabel
        elapseTimeLabel_1 = (TextView) findViewById(R.id.elapseTimeLabel1);
        elapseTimeLabel_2 = (TextView) findViewById(R.id.elapseTimeLabel2);
        elapseTimeLabel_3 = (TextView) findViewById(R.id.elapseTimeLabel3);
        elapseTimeLabel_4 = (TextView) findViewById(R.id.elapseTimeLabel4);
        elapseTimeLabel_5 = (TextView) findViewById(R.id.elapseTimeLabel5);
        elapseTimeLabel_6 = (TextView) findViewById(R.id.elapseTimeLabel6);
        elapseTimeLabel_7 = (TextView) findViewById(R.id.elapseTimeLabel7);
        elapseTimeLabel_8 = (TextView) findViewById(R.id.elapseTimeLabel8);
        elapseTimeLabel_9 = (TextView) findViewById(R.id.elapseTimeLabel9);
        elapseTimeLabel_10 = (TextView) findViewById(R.id.elapseTimeLabel10);
        elapseTimeLabel_11 = (TextView) findViewById(R.id.elapseTimeLabel11);
        elapseTimeLabel_12 = (TextView) findViewById(R.id.elapseTimeLabel12);
        elapseTimeLabel_13 = (TextView) findViewById(R.id.elapseTimeLabel13);
//        end elapsetimelabel

//        remaining time label
        remainingTimeLabel_1 = (TextView) findViewById(R.id.remainingTimeLabel1);
        remainingTimeLabel_2 = (TextView) findViewById(R.id.remainingTimeLabel2);
        remainingTimeLabel_3 = (TextView) findViewById(R.id.remainingTimeLabel3);
        remainingTimeLabel_4 = (TextView) findViewById(R.id.remainingTimeLabel4);
        remainingTimeLabel_5 = (TextView) findViewById(R.id.remainingTimeLabel5);
        remainingTimeLabel_6 = (TextView) findViewById(R.id.remainingTimeLabel6);
        remainingTimeLabel_7 = (TextView) findViewById(R.id.remainingTimeLabel7);
        remainingTimeLabel_8 = (TextView) findViewById(R.id.remainingTimeLabel8);
        remainingTimeLabel_9 = (TextView) findViewById(R.id.remainingTimeLabel9);
        remainingTimeLabel_10 = (TextView) findViewById(R.id.remainingTimeLabel10);
        remainingTimeLabel_11 = (TextView) findViewById(R.id.remainingTimeLabel11);
        remainingTimeLabel_12 = (TextView) findViewById(R.id.remainingTimeLabel12);
        remainingTimeLabel_13 = (TextView) findViewById(R.id.remainingTimeLabel13);
//        end remaining time label

//        position bar
        positionBar_1 = (SeekBar) findViewById(R.id.positionBar1);
        positionBar_2 = (SeekBar) findViewById(R.id.positionBar2);
        positionBar_3 = (SeekBar) findViewById(R.id.positionBar3);
        positionBar_4 = (SeekBar) findViewById(R.id.positionBar4);
        positionBar_5 = (SeekBar) findViewById(R.id.positionBar5);
        positionBar_6 = (SeekBar) findViewById(R.id.positionBar6);
        positionBar_7 = (SeekBar) findViewById(R.id.positionBar7);
        positionBar_8 = (SeekBar) findViewById(R.id.positionBar8);
        positionBar_9 = (SeekBar) findViewById(R.id.positionBar9);
        positionBar_10 = (SeekBar) findViewById(R.id.positionBar10);
        positionBar_11 = (SeekBar) findViewById(R.id.positionBar11);
        positionBar_12 = (SeekBar) findViewById(R.id.positionBar12);
        positionBar_13 = (SeekBar) findViewById(R.id.positionBar13);
//        end position bar

        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PercakapanBahasaArab3.this, MainActivity.class));
                finish();
            }
        });

        percakapan1();
        percakapan2();
        percakapan3();
        percakapan4();
        percakapan5();
        percakapan6();
        percakapan7();
        percakapan8();
        percakapan9();
        percakapan10();
        percakapan11();
        percakapan12();
        percakapan13();
    }


    //    percakapan 1
    private void percakapan1() {
        mp_1 = MediaPlayer.create(this, R.raw.percakapan_arab_16);
        mp_1.setLooping(false);
        mp_1.seekTo(0);
        mp_1.setVolume(0.5f, 0.5f);
        totalTime = mp_1.getDuration();

        positionBar_1.setMax(totalTime);
        positionBar_1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_1.seekTo(progress);
                    positionBar_1.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_1 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_1.getCurrentPosition();
                        handler1.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler1 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_1.setProgress(currentPosition);

            String elapseTime = createTimeLabel1(currentPosition);
            elapseTimeLabel_1.setText(elapseTime);

            String remainingTime = createTimeLabel1(totalTime = currentPosition);
            remainingTimeLabel_1.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel1(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick1(View view) {
        if (!mp_1.isPlaying()) {
            mp_1.start();
            playBtn_1.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_1.pause();
            playBtn_1.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }
//    end percakapan 1

    //    percakapan 2
    private void percakapan2() {
        mp_2 = MediaPlayer.create(this, R.raw.percakapan_arab_17);
        mp_2.setLooping(false);
        mp_2.seekTo(0);
        mp_2.setVolume(0.5f, 0.5f);
        totalTime = mp_2.getDuration();

        positionBar_2.setMax(totalTime);
        positionBar_2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_2.seekTo(progress);
                    positionBar_2.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_2 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_2.getCurrentPosition();
                        handler2.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler2 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_2.setProgress(currentPosition);

            String elapseTime = createTimeLabel2(currentPosition);
            elapseTimeLabel_2.setText(elapseTime);

            String remainingTime = createTimeLabel2(totalTime = currentPosition);
            remainingTimeLabel_2.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel2(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick2(View view) {
        if (!mp_2.isPlaying()) {
            mp_2.start();
            playBtn_2.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_2.pause();
            playBtn_2.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }
//    end percakapan 2

    //    percakapan 3
    private void percakapan3() {
        mp_3 = MediaPlayer.create(this, R.raw.percakapan_arab_18);
        mp_3.setLooping(false);
        mp_3.seekTo(0);
        mp_3.setVolume(0.5f, 0.5f);
        totalTime = mp_3.getDuration();

        positionBar_3.setMax(totalTime);
        positionBar_3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_3.seekTo(progress);
                    positionBar_3.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_3 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_3.getCurrentPosition();
                        handler3.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler3 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_3.setProgress(currentPosition);

            String elapseTime = createTimeLabel2(currentPosition);
            elapseTimeLabel_3.setText(elapseTime);

            String remainingTime = createTimeLabel3(totalTime = currentPosition);
            remainingTimeLabel_3.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel3(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick3(View view) {
        if (!mp_3.isPlaying()) {
            mp_3.start();
            playBtn_3.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_3.pause();
            playBtn_3.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }
//    end percakapan 3

    //    percakapan 4
    private void percakapan4() {
        mp_4 = MediaPlayer.create(this, R.raw.percakapan_arab_19);
        mp_4.setLooping(false);
        mp_4.seekTo(0);
        mp_4.setVolume(0.5f, 0.5f);
        totalTime = mp_4.getDuration();

        positionBar_4.setMax(totalTime);
        positionBar_4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_4.seekTo(progress);
                    positionBar_4.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_4 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_4.getCurrentPosition();
                        handler4.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler4 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_4.setProgress(currentPosition);

            String elapseTime = createTimeLabel4(currentPosition);
            elapseTimeLabel_4.setText(elapseTime);

            String remainingTime = createTimeLabel4(totalTime = currentPosition);
            remainingTimeLabel_4.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel4(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick4(View view) {
        if (!mp_4.isPlaying()) {
            mp_4.start();
            playBtn_4.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_4.pause();
            playBtn_4.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }
//    end percakapan 4


    //    percakapan 5
    private void percakapan5() {
        mp_5 = MediaPlayer.create(this, R.raw.percakapan_arab_20);
        mp_5.setLooping(false);
        mp_5.seekTo(0);
        mp_5.setVolume(0.5f, 0.5f);
        totalTime = mp_5.getDuration();

        positionBar_5.setMax(totalTime);
        positionBar_5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_5.seekTo(progress);
                    positionBar_5.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_5 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_5.getCurrentPosition();
                        handler5.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler5 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_5.setProgress(currentPosition);

            String elapseTime = createTimeLabel5(currentPosition);
            elapseTimeLabel_5.setText(elapseTime);

            String remainingTime = createTimeLabel5(totalTime = currentPosition);
            remainingTimeLabel_5.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel5(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick5(View view) {
        if (!mp_5.isPlaying()) {
            mp_5.start();
            playBtn_5.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_5.pause();
            playBtn_5.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }
//    end percakapan 5


    //    percakapan 6
    private void percakapan6() {
        mp_6 = MediaPlayer.create(this, R.raw.percakapan_arab_21);
        mp_6.setLooping(false);
        mp_6.seekTo(0);
        mp_6.setVolume(0.5f, 0.5f);
        totalTime = mp_6.getDuration();

        positionBar_6.setMax(totalTime);
        positionBar_6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_6.seekTo(progress);
                    positionBar_6.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_6 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_6.getCurrentPosition();
                        handler6.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler6 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_6.setProgress(currentPosition);

            String elapseTime = createTimeLabel6(currentPosition);
            elapseTimeLabel_6.setText(elapseTime);

            String remainingTime = createTimeLabel6(totalTime = currentPosition);
            remainingTimeLabel_6.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel6(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick6(View view) {
        if (!mp_6.isPlaying()) {
            mp_6.start();
            playBtn_6.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_6.pause();
            playBtn_6.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }
//    end percakapan 6


    //    percakapan 7
    private void percakapan7() {
        mp_7 = MediaPlayer.create(this, R.raw.percakapan_arab_22);
        mp_7.setLooping(false);
        mp_7.seekTo(0);
        mp_7.setVolume(0.5f, 0.5f);
        totalTime = mp_7.getDuration();

        positionBar_7.setMax(totalTime);
        positionBar_7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_7.seekTo(progress);
                    positionBar_7.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_7 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_7.getCurrentPosition();
                        handler7.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler7 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_7.setProgress(currentPosition);

            String elapseTime = createTimeLabel7(currentPosition);
            elapseTimeLabel_7.setText(elapseTime);

            String remainingTime = createTimeLabel7(totalTime = currentPosition);
            remainingTimeLabel_7.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel7(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick7(View view) {
        if (!mp_7.isPlaying()) {
            mp_7.start();
            playBtn_7.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_7.pause();
            playBtn_7.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }
//    end percakapan 7

    //    percakapan 8
    private void percakapan8() {
        mp_8 = MediaPlayer.create(this, R.raw.percakapan_arab_23);
        mp_8.setLooping(false);
        mp_8.seekTo(0);
        mp_8.setVolume(0.5f, 0.5f);
        totalTime = mp_8.getDuration();

        positionBar_8.setMax(totalTime);
        positionBar_8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_8.seekTo(progress);
                    positionBar_8.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_8 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_8.getCurrentPosition();
                        handler8.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler8 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_8.setProgress(currentPosition);

            String elapseTime = createTimeLabel8(currentPosition);
            elapseTimeLabel_8.setText(elapseTime);

            String remainingTime = createTimeLabel8(totalTime = currentPosition);
            remainingTimeLabel_8.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel8(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick8(View view) {
        if (!mp_8.isPlaying()) {
            mp_8.start();
            playBtn_8.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_8.pause();
            playBtn_8.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }

    //    end percakapan 8

    //    percakapan 9
    private void percakapan9() {
        mp_9 = MediaPlayer.create(this, R.raw.percakapan_arab_24);
        mp_9.setLooping(false);
        mp_9.seekTo(0);
        mp_9.setVolume(0.5f, 0.5f);
        totalTime = mp_9.getDuration();

        positionBar_9.setMax(totalTime);
        positionBar_9.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_9.seekTo(progress);
                    positionBar_9.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_9 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_9.getCurrentPosition();
                        handler9.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler9 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_9.setProgress(currentPosition);

            String elapseTime = createTimeLabel9(currentPosition);
            elapseTimeLabel_9.setText(elapseTime);

            String remainingTime = createTimeLabel9(totalTime = currentPosition);
            remainingTimeLabel_9.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel9(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick9(View view) {
        if (!mp_9.isPlaying()) {
            mp_9.start();
            playBtn_9.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_9.pause();
            playBtn_9.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }

    //    end percakapan 9

    //    percakapan 10
    private void percakapan10() {
        mp_10 = MediaPlayer.create(this, R.raw.percakapan_arab_25);
        mp_10.setLooping(false);
        mp_10.seekTo(0);
        mp_10.setVolume(0.5f, 0.5f);
        totalTime = mp_10.getDuration();

        positionBar_10.setMax(totalTime);
        positionBar_10.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_10.seekTo(progress);
                    positionBar_10.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_10 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_10.getCurrentPosition();
                        handler10.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler10 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_10.setProgress(currentPosition);

            String elapseTime = createTimeLabel10(currentPosition);
            elapseTimeLabel_10.setText(elapseTime);

            String remainingTime = createTimeLabel10(totalTime = currentPosition);
            remainingTimeLabel_10.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel10(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick10(View view) {
        if (!mp_10.isPlaying()) {
            mp_10.start();
            playBtn_10.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_10.pause();
            playBtn_10.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }

    //    end percakapan 10

    //    percakapan 11
    private void percakapan11() {
        mp_11 = MediaPlayer.create(this, R.raw.percakapan_arab_26);
        mp_11.setLooping(false);
        mp_11.seekTo(0);
        mp_11.setVolume(0.5f, 0.5f);
        totalTime = mp_11.getDuration();

        positionBar_11.setMax(totalTime);
        positionBar_11.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_11.seekTo(progress);
                    positionBar_11.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_11 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_11.getCurrentPosition();
                        handler11.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler11 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_11.setProgress(currentPosition);

            String elapseTime = createTimeLabel11(currentPosition);
            elapseTimeLabel_11.setText(elapseTime);

            String remainingTime = createTimeLabel11(totalTime = currentPosition);
            remainingTimeLabel_11.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel11(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick11(View view) {
        if (!mp_11.isPlaying()) {
            mp_11.start();
            playBtn_11.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_11.pause();
            playBtn_11.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }

    //    end percakapan 11

    //    percakapan 12
    private void percakapan12() {
        mp_12 = MediaPlayer.create(this, R.raw.percakapan_arab_27);
        mp_12.setLooping(false);
        mp_12.seekTo(0);
        mp_12.setVolume(0.5f, 0.5f);
        totalTime = mp_12.getDuration();

        positionBar_12.setMax(totalTime);
        positionBar_12.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_12.seekTo(progress);
                    positionBar_12.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_12 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_12.getCurrentPosition();
                        handler12.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler12 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_12.setProgress(currentPosition);

            String elapseTime = createTimeLabel12(currentPosition);
            elapseTimeLabel_12.setText(elapseTime);

            String remainingTime = createTimeLabel12(totalTime = currentPosition);
            remainingTimeLabel_12.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel12(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick12(View view) {
        if (!mp_12.isPlaying()) {
            mp_12.start();
            playBtn_12.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_12.pause();
            playBtn_12.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }

    //    end percakapan 12

    //    percakapan 13
    private void percakapan13() {
        mp_13 = MediaPlayer.create(this, R.raw.percakapan_arab_28);
        mp_13.setLooping(false);
        mp_13.seekTo(0);
        mp_13.setVolume(0.5f, 0.5f);
        totalTime = mp_13.getDuration();

        positionBar_13.setMax(totalTime);
        positionBar_13.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp_13.seekTo(progress);
                    positionBar_13.setProgress(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp_13 != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp_13.getCurrentPosition();
                        handler13.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }

    private Handler handler13 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_13.setProgress(currentPosition);

            String elapseTime = createTimeLabel13(currentPosition);
            elapseTimeLabel_13.setText(elapseTime);

            String remainingTime = createTimeLabel13(totalTime = currentPosition);
            remainingTimeLabel_13.setText("-" + remainingTime);
        }
    };

    public String createTimeLabel13(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick13(View view) {
        if (!mp_13.isPlaying()) {
            mp_13.start();
            playBtn_13.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
        } else {
            mp_13.pause();
            playBtn_13.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
        }
    }

    //    end percakapan 13

    @Override
    protected void onStop() {
        if (mp_1 != null && mp_1.isPlaying()) {
            mp_1.stop();
            mp_1.release();
            mp_1 = null;
        } else if (mp_2 != null && mp_2.isPlaying()) {
            mp_2.stop();
            mp_2.release();
            mp_2 = null;
        } else if (mp_3 != null && mp_3.isPlaying()) {
            mp_3.stop();
            mp_3.release();
            mp_3 = null;
        } else if (mp_4 != null && mp_4.isPlaying()) {
            mp_4.stop();
            mp_4.release();
            mp_4 = null;
        } else if (mp_5 != null && mp_5.isPlaying()) {
            mp_5.stop();
            mp_5.release();
            mp_5 = null;
        } else if (mp_6 != null && mp_6.isPlaying()) {
            mp_6.stop();
            mp_6.release();
            mp_6 = null;
        } else if (mp_7 != null && mp_7.isPlaying()) {
            mp_7.stop();
            mp_7.release();
            mp_7 = null;
        } else if (mp_8 != null && mp_8.isPlaying()) {
            mp_8.stop();
            mp_8.release();
            mp_8 = null;
        } else if (mp_9 != null && mp_9.isPlaying()) {
            mp_9.stop();
            mp_9.release();
            mp_9 = null;
        } else if (mp_10 != null && mp_10.isPlaying()) {
            mp_10.stop();
            mp_10.release();
            mp_10 = null;
        } else if (mp_11 != null && mp_11.isPlaying()) {
            mp_11.stop();
            mp_11.release();
            mp_11 = null;
        } else if (mp_12 != null && mp_12.isPlaying()) {
            mp_12.stop();
            mp_12.release();
            mp_12 = null;
        } else if (mp_13 != null && mp_13.isPlaying()) {
            mp_13.stop();
            mp_13.release();
            mp_13 = null;
        }

        super.onStop();
    }
}
