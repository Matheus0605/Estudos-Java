package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Convercor;

public class Conversor_Dolar_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação do dolar: ");
		Convercor.cotadolar = sc.nextDouble();
		System.out.println("Quantos dolares vai comprar? ");
		Convercor.compra = sc.nextDouble();
		System.out.printf("Valor em Reais: R$ %.2f%n", Convercor.valorDeCompra());
		
		
	}

}
