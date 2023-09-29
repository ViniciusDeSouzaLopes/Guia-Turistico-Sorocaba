package com.example.ac1pt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetalhesEstabelecimentoApplebees extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_estabelecimento_applebees);

        Button buttonMenuPrincipal = findViewById(R.id.buttonMenuPrincipal);

        buttonMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetalhesEstabelecimentoApplebees.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void abrirMapa(View view) {
        String latitude = "-23.523425999920242";
        String longitude = "-47.46544695756712";

        String uri = "geo:" + latitude + "," + longitude;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }

    public void abrirSite(View view) {
        String url = "https://www.applebees.com.br";

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void fazerLigacao(View view) {
        String phoneNumber = "15981045574";

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(intent);
    }
}