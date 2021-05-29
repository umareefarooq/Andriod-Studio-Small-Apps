package com.example.texttospeechapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {



    //step 1: making object of texttospeech class

    TextToSpeech t1;
    String Text = "This is the Magic of text to Speech";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 2: implementation of oninit method

        t1 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                t1.setLanguage(Locale.ENGLISH);
                t1.setPitch(1.0f);
                t1.setSpeechRate(1.0f);
            }
        });
    }

    public void tts(View view) {

        //step 3: text to speech object
        t1.speak(Text, TextToSpeech.QUEUE_FLUSH,null);


    }
}