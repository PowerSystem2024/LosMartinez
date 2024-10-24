
package tareamatriz;

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        /*
        Crear y cargar un matriz de tamaño 3x3, rtansponerla y mostrarla
        */
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        // Cargar la matriz
        System.out.println("Ingrese los elementos de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("\nMatriz original:");
        mostrarMatriz(matriz);

        // Transponer la matriz
        int[][] transpuesta = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        mostrarMatriz(transpuesta);
        
    }
    // Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
