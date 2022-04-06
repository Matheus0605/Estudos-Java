package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Banco_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		
		System.out.println("Numero da conta: ");
		int conta = sc.nextInt();
		
		System.out.println("Nome do Usuario: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Quer depositar? ");
		char opcao = sc.next().charAt(0);
			if (opcao == 's') {
				System.out.println("Qual o valor: ");
				double deposito = sc.nextDouble();
				banco = new Banco(nome, conta, deposito);
			}
			else {
				banco = new Banco(nome,conta);
			}
			
			System.out.println();
			System.out.println(banco);
			
			System.out.println();
			System.out.println("Valor de deposito: ");
			double valorDeposito = sc.nextDouble();
			banco.deposito(valorDeposito);
			System.out.println("Novo deposito feito, saldo atual: ");
			System.out.println(banco);
			
			System.out.println();
			System.out.println("Valor de Saque: ");
			double saque = sc.nextDouble();
			banco.saque(saque);
			System.out.println("Novo deposito feito, saldo atual: ");
			System.out.println(banco);
			
		 
		
		sc.close();
		
	}

}
