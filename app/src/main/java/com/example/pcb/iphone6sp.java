package com.example.pcb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class iphone6sp extends AppCompatActivity {
    private PDFView pdf;private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone6sp);
        pdf=(PDFView)findViewById(R.id.pdf_f2);
        pdf.fromAsset("iphone6sP.pdf").load();
        back=(Button)findViewById(R.id.back1);
    }
}
