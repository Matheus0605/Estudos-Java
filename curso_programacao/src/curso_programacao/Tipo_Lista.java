package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Tipo_Lista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		// Adicionar
//		String n = sc.nextLine();
		String n;
		list.add(n = sc.nextLine());
		list.add("Matheus");
		list.add("Suzana");
		list.add("Toni");
		list.add("Trazer");
		list.add(2, "XSonny");
		
		System.out.println("Quantidade de itens na lista: " + list.size());
				
		for (String x : list) {
			System.out.println(x);
		}
		
		//Remover
		System.out.println("-----------------------");
	
		list.removeIf(x -> x.charAt(0) == 'T');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		//Localizar Posição
		System.out.println("-----------------------");
		System.out.println("Localizando posiçao do item: " + list.indexOf("Matheus"));
		 // quando estiver " -1  " é por que nao esta na lista.
		
		
		//Filtrando Lista 
		System.out.println("-----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'w').findFirst().orElse(null);
		System.out.println(name);
		
		
		
	}

}
