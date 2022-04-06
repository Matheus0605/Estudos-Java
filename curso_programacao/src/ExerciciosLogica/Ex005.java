package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double x = sc.nextDouble();
        System.out.print("Nota 2: ");
        double y = sc.nextDouble();
        double media = (x + y) / 2;

        System.out.printf("A média entre %.1f e %.1f é %.1f ",x, y, media);



        sc.close();
    }
    
}
