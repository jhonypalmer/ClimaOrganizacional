package com.ufg2018.climaorganizacional.activities;

import android.content.Intent;
import android.content.PeriodicSync;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.ufg2018.climaorganizacional.R;

public class RespostaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas);
        getSupportActionBar().hide();
        Button btnNovaPesquisa = (Button)findViewById(R.id.btnNovaPesquisa);
        
        btnNovaPesquisa.setVisibility(View.VISIBLE);
    }

    public void btnNovaPesquisaOnClick(View v){
        Intent intent = new Intent(this, PerguntasActivity.class);
        startActivity(intent);
        finish();
    }
}
