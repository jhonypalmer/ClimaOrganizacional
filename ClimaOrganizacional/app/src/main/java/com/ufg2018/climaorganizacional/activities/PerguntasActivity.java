package com.ufg2018.climaorganizacional.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.ufg2018.climaorganizacional.R;

import java.util.ArrayList;
import java.util.List;

public class PerguntasActivity extends AppCompatActivity{
    TextView pergunta;
    RadioButton rbResposta1, rbResposta2, rbResposta3, rbResposta4, rbResposta5;
    RadioGroup rgRespostas;

    List<Questao> questoes = new ArrayList<Questao>(){
        {
            add(new Questao("O que você acha da forma de gestão da empresa ?", "Concordo", "Concordo parcialmente", "Discordo", "Discordo parcialmente", "Indiferente"));
            add(new Questao("O tratamento dos funcionários por seus superiores é correto?","Concordo", "Concordo parcialmente", "Discordo", "Discordo parcialmente", "Indiferente"));
            add(new Questao("A empresa posssui um bom plano de cargos e salários ?","Concordo", "Concordo parcialmente", "Discordo", "Discordo parcialmente", "Indiferente"));
            add(new Questao("É uma boa empresa para se trabalhar e desenvolver o conhecimento?", "Concordo", "Concordo parcialmente", "Discordo", "Discordo parcialmente", "Indiferente"));
        }
    };

    private void carregarQuestao(){
        if(questoes.size() > 0) {
            Questao q = questoes.remove(0);
            pergunta.setText(q.getPergunta());
            List<String> resposta = q.getRespostas();
            rbResposta1.setText(resposta.get(0));
            rbResposta2.setText(resposta.get(1));
            rbResposta3.setText(resposta.get(2));
            rbResposta4.setText(resposta.get(3));
            rbResposta5.setText(resposta.get(4));
            rgRespostas.setSelected(false);
        }
        else{ //acabaram as questões
            Intent intent = new Intent(this, UsersListActivity.class);

            intent.putExtra("msg", "Pesquisa finalizada!");
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas);
        getSupportActionBar().hide();

        pergunta = (TextView)findViewById(R.id.pergunta);
        rbResposta1 = (RadioButton)findViewById(R.id.rbResposta1);
        rbResposta2 = (RadioButton)findViewById(R.id.rbResposta2);
        rbResposta3 = (RadioButton)findViewById(R.id.rbResposta3);
        rbResposta4 = (RadioButton)findViewById(R.id.rbResposta4);
        rbResposta5 = (RadioButton)findViewById(R.id.rbResposta5);
        rgRespostas = (RadioGroup)findViewById(R.id.rgRespostas);
        carregarQuestao();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        carregarQuestao();
    }

    public void btnResponderOnClick(View v){
        RadioButton rb = (RadioButton)findViewById(rgRespostas.getCheckedRadioButtonId());
        Intent intent = new Intent(this, PerguntasActivity.class);
        startActivity(intent);
        rb.setChecked(false);
    }
}
