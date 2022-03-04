package com.example.threebeee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Twitter extends AppCompatActivity {

    WebView webview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);


        getSupportActionBar().hide();

        webview3=findViewById(R.id.web3);

        webview3.setWebViewClient(new WebViewClient());
        webview3.loadUrl("https://twitter.com");

        webview3.setWebChromeClient(new WebChromeClient());

        WebSettings websettings=webview3.getSettings();
        websettings.setJavaScriptEnabled(true);


    }

    @Override
    public void onBackPressed()
    { if(webview3.canGoBack())
    {
        webview3.goBack();
    }
    else
    {
        super.onBackPressed();
    }
    }
}