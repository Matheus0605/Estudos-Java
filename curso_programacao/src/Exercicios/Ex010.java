package Exercicios;
import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int fn = sc.nextInt();
		int h;
		
		if (in < fn) {
			h = fn - in;
			
		}
		else {
			h = 24 - in + fn;
			System.out.printf("O jogo durou %d Hora(s)", h);
		}
		System.out.printf("O jogo durou %d Hora(s)", h);
		
		sc.close();
	}

}
