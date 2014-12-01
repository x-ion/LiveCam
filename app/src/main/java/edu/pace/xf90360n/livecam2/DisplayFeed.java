package edu.pace.xf90360n.livecam2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;



public class DisplayFeed extends Activity {

    private WebView webView;
    private String address = "http://207.251.86.238/cctv320.jpg";
    private int interval = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_feed);

        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);




        if(  getIntent().getExtras() != null && getIntent().getExtras().getInt("interval") != 0)
            interval = getIntent().getExtras().getInt("interval");
        if ( getIntent().getExtras() != null && getIntent().getExtras().getString("address") != null)
            address = getIntent().getExtras().getString("address");

        String customHtml = "<!DOCTYPE html><html><head><script type=\"text/javascript\">" +
                "function onload(){"  +
                "document.getElementById(\"myPic\").src = \"" + address +
                "'+'?math='+Math.random()\";setInterval(\"onload()\"," + interval + ");}" +
                "</script></head><body onload=\"onload()\"><img id=\"myPic\"  /></body></html>";
        webView.loadData(customHtml, "text/html", "UTF-8");
    }

    public void goSettings(View view){
        Intent intent = new Intent(this, Settings.class);
        intent.putExtra("interval",interval);
        startActivity(intent);
    }



}
