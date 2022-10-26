package com.example.apkchatsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView penerima;
    public static final String KONTAK = "nama" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penerima = (TextView) findViewById(R.id.penerima);
    }

    public void pageIronman(View view) {
        Intent page =  new Intent(MainActivity.this, Page1.class);
        page.putExtra(KONTAK,"Batman");
        startActivity(page);

    }

    public void pageThorr(View view) {
        Intent page =  new Intent(MainActivity.this, Page1.class);
        page.putExtra(KONTAK,"Itachi");
        startActivity(page);
    }

    public void pageHawkeye(View view) {
        Intent page =  new Intent(MainActivity.this, Page1.class);
        page.putExtra(KONTAK,"Ultramen");
        startActivity(page);
    }
}