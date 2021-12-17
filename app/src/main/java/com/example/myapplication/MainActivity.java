package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnJawabarat, btnJawatengah, btnJakarta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJawabarat = findViewById(R.id.btnJawabarat);
        btnJawatengah = findViewById(R.id.btnJawatengah);
        btnJakarta = findViewById(R.id.btnJakarta);

        btnJawabarat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction()
                        .add(R.id.container, new JawabaratFragment()).commit();
            }
        });
    }
}