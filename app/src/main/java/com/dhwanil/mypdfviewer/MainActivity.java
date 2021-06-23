package com.dhwanil.mypdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("JavaScript The Definitive Guide Master the Worlds Most-Used Programming Language by David Flanagan (z-lib.org).pdf").load();

    }
}