package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisuzacoes;

    public Episodio(String nome, int ep) {
        this.setNome(nome);
        this.setNumero(ep);
    }

    public void setTotalVisuzacoes(int totalVisuzacoes) {
        this.totalVisuzacoes = totalVisuzacoes;
    }

    public int getTotalVisuzacoes() {
        return totalVisuzacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisuzacoes >= 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
