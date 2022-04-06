package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite um numero: ");
        double x = sc.nextDouble();

        System.out.println("O dobre de " + x  +" é " + (x*2));
        System.out.printf("A terça parte de %.2f é %.5f", x , (x/3));


        sc.close();
    }
    
}
