package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Ex01;
public class Ex01_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Ex01 x, y;
		x = new Ex01();
		y = new Ex01();
		
		System.out.println("Medindo Retangulo");
		System.out.println("Largura: ");
		x.a = sc.nextDouble();
		System.out.println("Altura: ");
		x.b = sc.nextDouble();
		
		System.out.println();
		double area = x.area();
		System.out.printf("AREA: %.2f%n", area);
		
		double perimetro = x.perimetro();
		System.out.printf("PERIMETRO %.2f%n", perimetro);
		
		double diagonal= x.diagonal();
		System.out.printf("PERIMETRO %.2f%n", diagonal);
	}

}
