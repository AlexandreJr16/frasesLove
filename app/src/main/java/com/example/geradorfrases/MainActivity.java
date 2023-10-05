package com.example.geradorfrases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GerarFrase(View view){
        String[] frases = {"Amor é fogo que arde sem doer", "i love u tomate"};
        int num = new Random().nextInt(frases.length);
        TextView text = findViewById(R.textView);
        text.setText(frases[num]);

    }
}