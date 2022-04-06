package curso_programacao;

import java.util.Scanner;

public class Funcoes_Sintaxe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quais os valores: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max (a, b, c);
		
		showResult(higher);

		sc.close();

	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z)	{
			aux = x;
		}
		else if (y > y) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
	

}
