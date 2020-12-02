package com.example.xilofono;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer DO;
    Button buttonDO;

    MediaPlayer RE;
    Button buttonRE;

    MediaPlayer MI;
    Button buttonMI;

    MediaPlayer FA;
    Button buttonFA;

    MediaPlayer SOL;
    Button buttonSOL;

    MediaPlayer LA;
    Button buttonLA;

    MediaPlayer SI;
    Button buttonSI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDO = (Button)findViewById(R.id.teclaDo);
        DO = MediaPlayer.create(this,R.raw.note1);
        buttonDO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DO.start();
            }
        });

        buttonRE = (Button)findViewById(R.id.teclaRe);
        RE = MediaPlayer.create(this,R.raw.note2);
        buttonRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RE.start();
            }
        });


        buttonMI = (Button)findViewById(R.id.teclaMi);
        MI = MediaPlayer.create(this,R.raw.note3);
        buttonMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MI.start();
            }
        });
        buttonFA = (Button)findViewById(R.id.teclaFa);
        FA = MediaPlayer.create(this,R.raw.note4);
        buttonFA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FA.start();
            }
        });

        buttonSOL = (Button)findViewById(R.id.teclaSol);
        SOL = MediaPlayer.create(this,R.raw.note5);
        buttonSOL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SOL.start();
            }
        });

        buttonLA = (Button)findViewById(R.id.teclaLa);
        LA = MediaPlayer.create(this,R.raw.note6);
        buttonLA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LA.start();
            }
        });
        buttonSI = (Button)findViewById(R.id.teclaSi);
        SI = MediaPlayer.create(this,R.raw.note7);
        buttonSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SI.start();
            }
        });




    }




}