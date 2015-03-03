package com.example.navigationdrawerexample;

import android.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewFragment;
import android.widget.Toast;

/**
 * Created by Saloni on 02/03/15.
 */
public class Rto extends Fragment{



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            //setContentView(R.layout.activity_main);

            // Let's display the progress in the activity title bar, like the
            // browser app does.
        View v = inflater.inflate(R.layout.rto_layout, container, false);

        WebView wv = (WebView) v.findViewById(R.id.webPage);
        if(wv!=null)
        {
        	wv.getSettings().setJavaScriptEnabled(true);
        	wv.setWebViewClient(new SwAWebClient()); wv.loadUrl("http://www.rtopune.info/index.htm");
        }



        return v;
    }

    private class SwAWebClient extends WebViewClient { @Override public boolean shouldOverrideUrlLoading(WebView view, String url) { return false; } }
}
