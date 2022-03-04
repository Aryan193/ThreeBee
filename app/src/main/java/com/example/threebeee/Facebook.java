package com.example.threebeee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Facebook extends AppCompatActivity {

    WebView webview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        getSupportActionBar().hide();

        webview1=findViewById(R.id.web1);

      webview1.setWebViewClient(new WebViewClient());
        webview1.loadUrl("https://www.facebook.com");

        webview1.setWebChromeClient(new WebChromeClient());

        WebSettings websettings=webview1.getSettings();
        websettings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed()
    { if(webview1.canGoBack())
    {
        webview1.goBack();
    }
    else
        {
            super.onBackPressed();
        }
    }
}