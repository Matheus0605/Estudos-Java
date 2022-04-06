package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Laco_For_Each {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] variavel = new String[] {"gordo", " toni" , "suzana", "trazer"};
		
		for (String i : variavel) {
			System.out.println(i);
		}
		
		
	}

}
