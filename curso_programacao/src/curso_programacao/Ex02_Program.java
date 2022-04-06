package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Ex02;

public class Ex02_Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Ex02 ex02 = new Ex02();
		
		
		System.out.println("Nome: ");
		ex02.name = sc.nextLine();
		System.out.println("Salário: ");
		ex02.salario = sc.nextDouble();
		System.out.println("Taxa: " + ex02.taxa);
		
		String x = ex02.toString();
		System.out.println(x);
		
		System.out.println();
		System.out.print("Porcentagem de acrescimo: ");
		ex02.porcento = sc.nextInt();
		
		double att = ex02.attValor();
		System.out.println("Atualizaçao de valor: " + att);
	}

}
