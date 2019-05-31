package com.example.pcb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class iph6Plus extends AppCompatActivity {
    private PDFView pdf;private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iph6_plus);
        pdf=(PDFView)findViewById(R.id.pdf_f2);
        pdf.fromAsset("iphone6plus.pdf").load();

    }
}
