package com.example.pcb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class bayFragmet extends Fragment {

    public bayFragmet () {


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View v= inflater.inflate(R.layout.bay, container, false);
            WebView webView=(WebView)v.findViewById(R.id.mai_webw);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl( "https://poisk123.ru");
        // Inflate the layout for this fragment
        return v;
    }

}
