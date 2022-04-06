package Exercicios;
import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
//		//sem scanner
//		int x = 10;
//		int y = 30;
//		int resultado = x + y;
//			System.out.println("Soma = " + resultado);
//		
//		int x2 = -30;
//		int y2 = 10;
//		int resultado2 = x2 + y2;
//			System.out.println("Soma = " + resultado2);
//			
		//com scanner
		Scanner sc = new Scanner(System.in);
		int x3, x4, s;
		
		x3 = sc.nextInt();
		x4 = sc.nextInt();
		
		s = x3 + x4;
		System.out.printf("Soma = %s", s);
		
		sc.close();
		
	}

}
