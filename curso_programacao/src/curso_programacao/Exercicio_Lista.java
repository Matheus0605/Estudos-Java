package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Exercicio_Lista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list  = new ArrayList<>();
		
		System.out.println("Quantos registros para analise: ");
		int n = sc.nextInt();
	
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i+1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
		
			Funcionario fun = new Funcionario(id,nome,salario);
			
			list.add(fun);
			System.out.println(fun);
			
		}
		
		System.out.println("Qual id que tera aumento: ");
		int idsalario = sc.nextInt();
		Integer pos = posicao(list, idsalario);
		
		if (pos == null) {
			System.out.println("Esse Id nao existe!");
			
		}
		else {
			System.out.println("Qual a porcentagem do aumento: ");
			double porcento = sc.nextDouble();
			list.get(pos).aumento(porcento);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		for (Funcionario fun : list) {
			System.out.println(fun);
		}
		

		sc.close();
	}

	public static Integer posicao(List<Funcionario> list, int id) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
