package Exercicios;
import java.util.Locale;
import java.util.Scanner;

import entities.Main;

public class Main_Program {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------- Lista de Animes --------");
		System.out.println("Escolha apenas 1: ");
		System.out.printf("[1] Naruto %n[2] One Punch Man %n[3] Dragon Ball Z%n");
		int n = sc.nextInt();

		
		
		
		
		
		
		
//      ##Switch e Case
//		switch (n) {
//		case 1: 
//			System.out.printf("Naruto � um jovem �rf�o habitante da Vila da Folha que sonha se tornar o quinto Hokage,%no maior guerreiro e governante da vila.%nAo se graduar como ninja, descobre que tem um dem�nio raposa selado dentro de si.\r\n");
//			break;
//		case 2:
//			System.out.printf("One Punch-Man conta a hist�ria de Saitama, um super-her�i extremamente poderoso,%nque se entediou com a aus�ncia dos desafios nas suas lutas contra o mal e procura encontrar um oponente digno.");
//			break;
//		case 3:
//			System.out.printf("Criada por Akira Toryiama, a franquia conta a hist�ria de Son Goku,%nguerreiro que descobre ser parte de um legado de poderosos conquistadores alien�genas%ne passa a defender seu planeta adotivo, a Terra, de outros seres%nigualmente superfortes e capazes de feitos descomunais.");
//		}
		
		
		
//		##If e Else 
//		if (n == 1) {
//			System.out.printf("Naruto � um jovem �rf�o habitante da Vila da Folha que sonha se tornar o quinto Hokage,%no maior guerreiro e governante da vila.%nAo se graduar como ninja, descobre que tem um dem�nio raposa selado dentro de si.\r\n");
//		}
//		else if (n == 2) {
//			System.out.printf("One Punch-Man conta a hist�ria de Saitama, um super-her�i extremamente poderoso,%nque se entediou com a aus�ncia dos desafios nas suas lutas contra o mal e procura encontrar um oponente digno.");
//		}
//		else if (n == 3) {
//			System.out.printf("Criada por Akira Toryiama, a franquia conta a hist�ria de Son Goku,%nguerreiro que descobre ser parte de um legado de poderosos conquistadores alien�genas%ne passa a defender seu planeta adotivo, a Terra, de outros seres%nigualmente superfortes e capazes de feitos descomunais.");
//		}
		
		sc.close();
		
	}
	
	
	
}