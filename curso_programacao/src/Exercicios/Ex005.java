package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p1, p2;
		int n1, n2;
		double v1, v2, total;	
		
		System.out.println("Pe�a 1\nQual codigo da pe�a?\nQual a quantia? \nQual o valor unitario dela?");
		p1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();
		System.out.println("Pe�a 2\nQual codigo da pe�a?\nQual a quantia?\nQual o valor unitario dela?");
		p2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		total = (n1 * v1) + (n2 * v2);	
		System.out.printf("Valor a pagar: %.2f", total);
		
	}

}
