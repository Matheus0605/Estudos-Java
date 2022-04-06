package Exercicios;
import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Qual o valor? ");
		valor = sc.nextInt();
		
		if (valor < 0) {
			System.out.println("Negativo!");
		}
		else {
			System.out.println("Nao Negativo!");
		}
		
	}

}
