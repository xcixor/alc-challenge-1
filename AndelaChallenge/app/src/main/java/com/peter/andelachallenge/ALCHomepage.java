package com.peter.andelachallenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ALCHomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alchomepage);

//        Set the webview content
        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.setWebViewClient(
                new WebViewClient() {@Override public void onReceivedSslError
                        (WebView v, SslErrorHandler handler, SslError er){ handler.proceed();
                }});
        WebSettings webSetting = myWebView.getSettings();
        webSetting.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://andela.com/alc/");

//        create back button in action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About ALC");
        actionBar.setElevation(0);
    }


}
