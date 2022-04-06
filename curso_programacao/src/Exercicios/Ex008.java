package Exercicios;
import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Qual o valor? ");
		valor = sc.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println("PAR!");
		}
		else {
			System.out.println("IMPAR!");
		}
	}

}
