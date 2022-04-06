package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Mercado_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0;
		
		System.out.println("Quantos produtos foram comprados: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Valor do produto: ");
			double produto = sc.nextDouble();
			soma = soma + produto;
			
		}
		
		System.out.println("Valor da compra: " + soma);
		
		
		sc.close();
	}

}
