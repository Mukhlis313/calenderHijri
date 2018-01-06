package com.example.mukhlish.calender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button pindah;
    Button hijri;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        hijri = (Button) findViewById(R.id.btnMasehi);
        pindah = (Button) findViewById(R.id.btnHijri);
        save = (Button) findViewById(R.id.date);

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah_tempat = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(pindah_tempat);
            }
        });

        hijri.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent pindah_tempat = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(pindah_tempat);
            }
        });

     }
}
