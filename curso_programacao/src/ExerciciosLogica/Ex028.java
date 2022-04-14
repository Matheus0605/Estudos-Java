package ExerciciosLogica;

import java.util.Locale;
import java.util.Scanner;

public class Ex028 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------");
        System.out.println("Area do terreno");
        System.out.println("-------------------");
        System.out.println("Largura: ");
        int larg = sc.nextInt();
        System.out.println("Comprimento: ");
        int comp = sc.nextInt();
        int area = larg * comp;

        if (area < 100) {
            System.out.println("TERRENO POPULAR");
        }
        else if (area >= 100 & area < 500) {
            System.out.println("TERRENO MASTER");
        }
        else {
            System.out.println("TERRENO VIP");
        }


        sc.close();
    }
    
}
