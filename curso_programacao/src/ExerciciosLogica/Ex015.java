package ExerciciosLogica;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Ex015 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dias trabalhados: ");
        int dias = sc.nextInt();
        int sal = (25 * 8) * dias;
        
        System.out.println("O valor do seu salário esse mes é de R$" + sal);

        sc.close();
    }
}
