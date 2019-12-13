package com.example.agenciaviagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button buttonCidade, buttonOferta, buttonSobre, buttonContato, buttonLocalizacao;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCidade = findViewById(R.id.buttonCidade);
        buttonOferta = findViewById(R.id.buttonOferta);
        buttonSobre = findViewById(R.id.buttonSobre);
        buttonContato = findViewById(R.id.buttonContato);
        buttonLocalizacao = findViewById(R.id.buttonLocalizacao);

        buttonCidade.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent abrirCidade = new Intent(getApplicationContext(), Cidade.class);
                startActivity(abrirCidade);
            }
        });

        buttonOferta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent abrirOfertas = new Intent(getApplicationContext(), Oferta.class);
                startActivity(abrirOfertas);
            }
        });

        buttonSobre.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent abrirSobre = new Intent(getApplicationContext(), Sobre.class);
                startActivity(abrirSobre);
            }
        });

        buttonContato.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent abrirContato = new Intent(getApplicationContext(), Contato.class);
                startActivity(abrirContato);
            }
        });

        buttonLocalizacao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent abrirLocalizacao = new Intent(getApplicationContext(), LocalizacaoMapa.class);
                startActivity(abrirLocalizacao);
            }
        });

    }
}
