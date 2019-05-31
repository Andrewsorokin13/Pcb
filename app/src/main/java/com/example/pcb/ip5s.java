package com.example.pcb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class ip5s extends AppCompatActivity {
    private PDFView pdf;private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip5s);
        pdf=(PDFView)findViewById(R.id.pdf_f2);
        pdf.fromAsset("iphone5s.pdf").load();
        back=(Button)findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ip5s.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
