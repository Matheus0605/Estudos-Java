package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Vetor;

public class Vetor_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Vetor[] vect = new Vetor[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Vetor(nome,preco);
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vect[i].getPreco();
		}
		double avg = soma / n;
		
		System.out.printf("Preço média: %.2f%n", avg);
		
		sc.close();
	}
}
