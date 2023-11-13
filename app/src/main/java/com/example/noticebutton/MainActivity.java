package com.example.noticebutton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        // JavaScript 사용 허용
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // WebViewClient 설정
        webView.setWebViewClient(new WebViewClient());

        // Button1에 대한 클릭 이벤트 처리
        Button button1 = findViewById(R.id.button1);
        setButtonClickListener(button1, "https://www.mmu.ac.kr/main/board/301");

        // Button2에 대한 클릭 이벤트 처리
        Button button2 = findViewById(R.id.button2);
        setButtonClickListener(button2, "https://www.mmu.ac.kr/main/board/302");

        // Button3에 대한 클릭 이벤트 처리
        Button button3 = findViewById(R.id.button3);
        setButtonClickListener(button3, "https://www.mmu.ac.kr/S1/board/78");

        // Button4에 대한 클릭 이벤트 처리
        Button button4 = findViewById(R.id.button4);
        setButtonClickListener(button4, "https://www.mmu.ac.kr/S1/board/79");

        // Button5에 대한 클릭 이벤트 처리
        Button button5 = findViewById(R.id.button5);
        setButtonClickListener(button5, "https://www.mmu.ac.kr/main/contents/todayMenu1");
    }

    private void setButtonClickListener(Button button, final String url) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebPage(url);
            }
        });
    }

    private void openWebPage(String url) {
        webView.loadUrl(url);
        Log.d("WebView", "Opening URL: " + url);
    }

    @Override
    protected void onDestroy() {
        if (webView != null) {
            webView.destroy();
        }
        super.onDestroy();
    }
}
