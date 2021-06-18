package com.example.webbrowserapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = (EditText)findViewById(R.id.et);
        wv = (WebView)findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);


        wv.setWebViewClient(new WebViewClient()
        {
            public boolean shouldOverrideUrlLoading( WebView view, String url)
            {
                view.loadUrl(url);
                return false;
            }
        });

    }


    public void search(View view) {

        String url = ed.getText().toString();
        wv.loadUrl(url);
    }

    public void forward(View view) {
        //forward method
        wv.goForward();
    }

    public void back(View view) {
        //back method
        wv.goBack();
    }
}