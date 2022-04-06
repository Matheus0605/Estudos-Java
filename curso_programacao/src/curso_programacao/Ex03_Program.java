package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Ex03;

public class Ex03_Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Ex03 ex03 = new Ex03();
		
		System.out.println("Nome do aluno: ");
		ex03.name = sc.nextLine();
		System.out.println("Digite as 3 notas do Trimestre: ");
		ex03.a = sc.nextDouble();
		ex03.b = sc.nextDouble();
		ex03.c = sc.nextDouble();
		
		String name = ex03.toString();
		System.out.println(name);
		if (ex03.notaFinal() > 60) {
			System.out.println("Aprovado!");
		}
		else {
			double reprova = ex03.reprova();
			System.out.println("Reprovado!!");
			System.out.printf("Pontos necessarios: %.2f", reprova);
		}
		
	}

}
