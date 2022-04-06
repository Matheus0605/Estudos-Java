package Exercicios;
import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Mutiplos!");
		}
		else {
			System.out.println("Nao Sao Mutiplos!");
		}
		sc.close();
	}

}
