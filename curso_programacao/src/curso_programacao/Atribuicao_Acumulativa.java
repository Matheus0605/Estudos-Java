package curso_programacao;


import java.util.Locale;
import java.util.Scanner;

public class Atribuicao_Acumulativa {

	// -=, +=, /=, *=, %=
	
		public static void main(String[] args) {
			// Estrutura condicional
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int minuto = sc.nextInt();
			double conta = 50.0;
			
			if (minuto > 100) {
				conta += (minuto - 100) * 2.0;
			}
			
			System.out.printf("O valor da conta = R$ %.2f", conta);
			
			
			sc.close();
		}
	}