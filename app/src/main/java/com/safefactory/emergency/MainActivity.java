package com.safefactory.emergency;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends Activity {
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Immersive dark container matching app theme
        FrameLayout frame = new FrameLayout(this);
        frame.setBackgroundColor(Color.rgb(6, 11, 20));

        TextView splash = new TextView(this);
        splash.setText("🛡️\nSafeFactory 3D\n\nINDUSTRIAL DIGITAL TWIN");
        splash.setTextColor(Color.rgb(84, 231, 187));
        splash.setTextSize(20);
        splash.setGravity(Gravity.CENTER);
        splash.setLineSpacing(8f, 1f);
        frame.addView(splash);
        setContentView(frame);

        new Handler(getMainLooper()).postDelayed(() -> {
            web = new WebView(this);
            web.setBackgroundColor(Color.rgb(6, 11, 20));
            web.setLayerType(View.LAYER_TYPE_HARDWARE, null);

            WebSettings settings = web.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setMediaPlaybackRequiresUserGesture(false);

            web.setWebViewClient(new WebViewClient());
            frame.removeAllViews();
            frame.addView(web);
            web.loadUrl("file:///android_asset/index.html");
        }, 800);
    }

    @Override
    public void onBackPressed() {
        if (web != null && web.canGoBack()) {
            web.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
