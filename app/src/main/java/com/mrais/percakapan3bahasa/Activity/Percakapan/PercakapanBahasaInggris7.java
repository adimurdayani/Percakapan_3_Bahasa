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

public class PercakapanBahasaInggris7 extends AppCompatActivity {
    Button playBtn_1, playBtn_2, playBtn_3, playBtn_4;
    SeekBar positionBar_1, positionBar_2, positionBar_3, positionBar_4;
    TextView elapseTimeLabel_1, elapseTimeLabel_2, elapseTimeLabel_3, elapseTimeLabel_4;
    TextView remainingTimeLabel_1, remainingTimeLabel_2, remainingTimeLabel_3, remainingTimeLabel_4;
    MediaPlayer mp_1, mp_2, mp_3, mp_4;
    int totalTime;

    ImageView btn_kembali, btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percakapan_bahasa_inggris7);
        init();
    }

    private void init() {
        btn_home = findViewById(R.id.btn_home);
        btn_kembali = findViewById(R.id.btn_kembali);

        playBtn_1 = (Button) findViewById(R.id.btnplay1);
        playBtn_2 = (Button) findViewById(R.id.btnplay2);
        playBtn_3 = (Button) findViewById(R.id.btnplay3);
        playBtn_4 = (Button) findViewById(R.id.btnplay4);
        elapseTimeLabel_1 = (TextView) findViewById(R.id.elapseTimeLabel1);
        elapseTimeLabel_2 = (TextView) findViewById(R.id.elapseTimeLabel2);
        elapseTimeLabel_3 = (TextView) findViewById(R.id.elapseTimeLabel3);
        elapseTimeLabel_4 = (TextView) findViewById(R.id.elapseTimeLabel4);
        remainingTimeLabel_1 = (TextView) findViewById(R.id.remainingTimeLabel1);
        remainingTimeLabel_2 = (TextView) findViewById(R.id.remainingTimeLabel2);
        remainingTimeLabel_3 = (TextView) findViewById(R.id.remainingTimeLabel3);
        remainingTimeLabel_4 = (TextView) findViewById(R.id.remainingTimeLabel4);
        positionBar_1 = (SeekBar) findViewById(R.id.positionBar1);
        positionBar_2 = (SeekBar) findViewById(R.id.positionBar2);
        positionBar_3 = (SeekBar) findViewById(R.id.positionBar3);
        positionBar_4 = (SeekBar) findViewById(R.id.positionBar4);

        btn_home.setOnClickListener(v -> {
            startActivity(new Intent(PercakapanBahasaInggris7.this, MainActivity.class));
            finish();
        });
        btn_kembali.setOnClickListener(v -> {
            onBackPressed();
        });

        percakapan1();
        percakapan2();
        percakapan3();
        percakapan4();
    }

    // percakapan 1
    private void percakapan1() {
        // percakapan 1
        mp_1 = MediaPlayer.create(this, R.raw.percakapan_43);
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

    //percakapan 1
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

    // percakapan 2
    private void percakapan2() {
// percakapan 2
        mp_2 = MediaPlayer.create(this, R.raw.percakapan_44);
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

    // percakapan 2
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

    // percakapan 3
    private void percakapan3() {
// percakapan 3
        mp_3 = MediaPlayer.create(this, R.raw.percakapan_45);
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

    // percakapan 3
    private Handler handler3 = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosition = msg.what;
            positionBar_3.setProgress(currentPosition);

            String elapseTime = createTimeLabel3(currentPosition);
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

    // percakapan 4
    private void percakapan4() {
// percakapan 4
        mp_4 = MediaPlayer.create(this, R.raw.percakapan_46);
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

    // percanakapan 4
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
        }

        super.onStop();
    }
}
