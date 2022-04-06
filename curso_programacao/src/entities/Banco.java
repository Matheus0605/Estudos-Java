package entities;

import java.util.Scanner;

public class Banco {
	
	
	private String nome;
	private int conta;
	private double balanco;
	
	public Banco(String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}

	public Banco(String nome, int conta, double depositoInicial) {
		super();
		this.nome = nome;
		this.conta = conta;
		deposito(depositoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}


	public double getBalanco() {
		return balanco;
	}	
	
	public void deposito (double saldo) {
		balanco += saldo;
	}
	
	public void saque(double saldo) {
		balanco -= saldo + 5.0;
	}
	
	public String toString() {
		return "Numero da conta: "
				+ conta
				+ ", Usuario: "
				+ nome
				+ ", Valor do deposito: $ "
				+ String.format("%.2f", balanco);
	}
	
	
}
