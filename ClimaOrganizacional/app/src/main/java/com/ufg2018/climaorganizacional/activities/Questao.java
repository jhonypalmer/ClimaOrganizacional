package com.ufg2018.climaorganizacional.activities;

import java.util.ArrayList;
import java.util.List;

public class Questao {

    private String pergunta;
    private List<String> respostas = new ArrayList<>();

    public Questao(String pergunta, String... respostas){
        this.pergunta = pergunta;
        this.respostas.add(respostas[0]);
        this.respostas.add(respostas[1]);
        this.respostas.add(respostas[2]);
        this.respostas.add(respostas[3]);
        this.respostas.add(respostas[4]);
    }

    public String getPergunta(){ return this.pergunta; }
    public List<String> getRespostas(){ return this.respostas; }
}
