package curso_programacao;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Scanner;

import entities.Estoque;

public class Estoque_Progam {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Entrada do produto: ");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		
		Estoque estoque = new Estoque(name, preco);
		
		estoque.setName("Computador");
		System.out.println("Nome atualizado " + estoque.getName());
		estoque.setPreco(1200.00);
		System.out.println("Preco atualizado " + estoque.getPreco());
		
		System.out.println(estoque);
		System.out.println("Mais quantos produtos vai adicionar: ");
		int quantidade = sc.nextInt();
		estoque.addProduto(quantidade);

		System.out.println();
		System.out.println("Atualizaçao do carrinho: " + estoque);

		System.out.println();
		System.out.println("Quantos produtos vai remover: ");
		quantidade = sc.nextInt();
		estoque.removerProduto(quantidade);

		System.out.println();
		System.out.println("Atualizaçao do carrinho: " + estoque);

		sc.close();
	}

}
