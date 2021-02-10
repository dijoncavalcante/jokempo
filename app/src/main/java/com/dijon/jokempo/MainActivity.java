package com.dijon.jokempo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView jogador1;
    ImageView jogador2;
    ImageButton botaoPedra;
    ImageButton botaoPapel;
    ImageButton botaoTesura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogador1 = findViewById(R.id.jogador1);
        jogador2 = findViewById(R.id.jogador2);
        botaoPedra = findViewById(R.id.botaoPedra);
        botaoPapel = findViewById(R.id.botaoPapel);
        botaoTesura = findViewById(R.id.botaoTesoura);
    }


    public void tocouBotao(View view) {
        jogador1.setScaleX(-1);
        switch (view.getId()) {
            case (R.id.botaoPedra):
                jogador1.setImageResource(R.drawable.pedra);
                break;
            case (R.id.botaoPapel):
                jogador1.setImageResource(R.drawable.papel);
                break;
            case (R.id.botaoTesoura):
                jogador1.setImageResource(R.drawable.tesoura);
                break;
        }
        jogador2.setImageResource(R.drawable.interrogacao);
    }
}