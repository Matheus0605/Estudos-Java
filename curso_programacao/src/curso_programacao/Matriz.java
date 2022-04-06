package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] agrs) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de Colunas: ");
        int c = sc.nextInt();
        System.out.print("Tamanho linha Horizontal: ");
        int n = sc.nextInt();
        int[][] mat = new int[c][n];
                                                            
        for (int i=0; i<c; i++) { // <-- Numero de colunas.
            for (int j=0; j<n; j++) {   // <-- Numeros de linhas Horizontais.
                mat[i][j] = sc.nextInt(); // <-- Alocação de valores nas Colunas e Horizontais.
            }
        
        }
        
        System.out.println("Dessa matriz, escolha um numero: ");
        int x = sc.nextInt();

        for (int i=0; i<x; i++) {
            for (int j=0; j<x; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Posição: " + i + ", " + j );
                   
                    if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
                    }
                
                }
            }
        }
    



        sc.close();
    }

}
