package exerc15;

import java.util.Scanner;

public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double despesas;

    public Produto(String nome, double precoCusto, double precoVenda, double despesas) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.despesas = despesas;
    }

    public double calcularMargemLucro() {
        double margemLucro = ((precoVenda - (precoCusto + despesas)) / precoVenda) * 100;
        return margemLucro;
    }
    
}