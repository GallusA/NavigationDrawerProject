package com.example.gallusawa.navigationdrawerproject;


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
public class SixthFragment extends Fragment {


    WebView webView;

    public SixthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sixth, container, false);

        webView = (WebView) view.findViewById(R.id.webView);
        webView.loadUrl("https://www.google.com/?client=safari&channel=mac_bm");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient( new WebViewClient());


        return view;

    }

}
