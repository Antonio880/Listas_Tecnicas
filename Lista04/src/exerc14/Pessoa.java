package exerc14;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private int idade;
	private int dia;
	private int mes;
	private int ano;
	private String nome;

	public Pessoa(int idade, int dia, int mes, int ano, String nome) {
		super();
		
		this.idade = idade;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.nome = nome;
	}
	
	public void calculaIdade() {
		LocalDate dataNascimento = LocalDate.of(this.ano, this.mes, this.dia);
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
        this.idade = periodo.getYears();
	}
	
	public int informaIdade() {
		return this.idade;
	}
	
	public String informaNome() {
		return this.nome;
	}
	
	public void ajustaDataDeNascimento(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
