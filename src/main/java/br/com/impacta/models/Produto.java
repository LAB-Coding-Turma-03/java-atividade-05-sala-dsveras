package br.com.impacta.models;

public class Produto {
    int codigo;
    String descricao;
    double valor;

    public Produto (int codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String montarResumo() {
        return "codigo: " + this.codigo + ", produto: " + this.descricao + ", valor: " + this.valor; 
    }
}

