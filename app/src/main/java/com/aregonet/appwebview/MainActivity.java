package com.aregonet.appwebview;



import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   private WebView myWebview;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebview = findViewById(R.id.webview);
                myWebview.setWebViewClient(new WebViewClient());
        WebSettings webSettings= myWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        myWebview.loadUrl("https://aregonet.com");

    }
    @Override
    public void onBackPressed() {
        if (myWebview.canGoBack()){
            myWebview.goBack();

        }else{
            super.onBackPressed();
        }
    }
}