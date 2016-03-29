package ice_pbru.duangsang.junamon.piano;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //2.Explicit
    //access  type  name
    private Button DoButton;
    private Button ReButton;
    private Button MiButton;
    private Button FaButton;
    private Button SolButton;
    private Button LaButton;
    private Button TiButton;
    private Button DOButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3.Bind widget
        bindwidget();
        //4.Button Controller
        buttonController();


    }//Main Method

    private void buttonController() {
        DoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer DoMediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.song1);
                DoMediaPlayer.start();

                DoMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });

            }
        });
        ReButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer ReMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song2);
                ReMediaPlayer.start();
                ReMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        MiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer MiMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song3);
                MiMediaPlayer.start();
                MiMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        FaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer FaMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song4);
                FaMediaPlayer.start();
                FaMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        SolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer SolMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song5);
                SolMediaPlayer.start();
                SolMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        LaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer LaMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.song6);
                LaMediaPlayer.start();
                LaMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });
        TiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer TiMedaiPlayer = MediaPlayer.create(getBaseContext(), R.raw.song7);
                TiMedaiPlayer.start();
                TiMedaiPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


    }//buttonController

    private void bindwidget() {
        DoButton = (Button) findViewById(R.id.button);
        ReButton = (Button) findViewById(R.id.button2);
        MiButton = (Button) findViewById(R.id.button3);
        FaButton = (Button) findViewById(R.id.button4);
        SolButton = (Button) findViewById(R.id.button5);
        LaButton = (Button) findViewById(R.id.button6);
        TiButton = (Button) findViewById(R.id.button7);
        DOButton = (Button) findViewById(R.id.button8);


    }//bind widget

}//Main class

//1.หาขอบเขต
//2.Explicit
//3.Bind widget