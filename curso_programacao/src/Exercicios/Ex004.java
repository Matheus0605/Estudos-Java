package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double ph, salario;
		int f,h;
		f = sc.nextInt();
		h = sc.nextInt();
		ph = sc.nextDouble();
		salario = h * ph;
		  System.out.printf("Numero do Funcionario: %s\n", f);
		  System.out.printf("Salario: %.2f\n", salario);
		
	}

}
