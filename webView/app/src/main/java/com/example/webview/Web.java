package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = (WebView) findViewById(R.id.webView);
        String url = getIntent().getStringExtra("url").toString();
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://" + url);

    }

    public void _btn_cerrar (View view){
        finish();
    }
}