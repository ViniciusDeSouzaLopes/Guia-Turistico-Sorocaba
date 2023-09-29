package com.example.ac1pt2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonDetalhesEstabelecimentoArtesanos = findViewById(R.id.buttonDetalhesEstabelecimentoArtesanos);

        buttonDetalhesEstabelecimentoArtesanos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalhesEstabelecimentoArtesanosActivity.class);
                startActivity(intent);
            }
        });

        Button buttonDetalhesEstabelecimentoYosugiru = findViewById(R.id.buttonDetalhesEstabelecimentoYosugiru);

        buttonDetalhesEstabelecimentoYosugiru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalhesEstabelecimentoYosugiru.class);
                startActivity(intent);
            }
        });

        Button buttonDetalhesEstabelecimentoApple = findViewById(R.id.buttonDetalhesEstabelecimentoApple);

        buttonDetalhesEstabelecimentoApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetalhesEstabelecimentoApplebees.class);
                startActivity(intent);
            }
        });
    }
}