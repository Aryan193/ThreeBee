package com.example.threebeee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Instagram extends AppCompatActivity {

    WebView webview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);


        getSupportActionBar().hide();

        webview2=findViewById(R.id.web2);

        webview2.setWebViewClient(new WebViewClient());
        webview2.loadUrl("https://www.instagram.com");

        webview2.setWebChromeClient(new WebChromeClient());

        WebSettings websettings=webview2.getSettings();
        websettings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed()
    { if(webview2.canGoBack())
    {
        webview2.goBack();
    }
    else
    {
        super.onBackPressed();
    }

    }
}