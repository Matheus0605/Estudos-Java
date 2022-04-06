package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Hotel_Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos seram alocados? ");
		int n = sc.nextInt();
		Hotel[] ht = new Hotel[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Alocaçao "+ i + ": ");
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			ht[i] = new Hotel(nome,email,quarto);
			
		}
		
		for (int i=0; i<10; i++) {
			if (ht[i] != null) {
				System.out.println(i + ": "+ ht[i]);
			}
		}
		
	}

}
