package tareamatriz;

import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        /*
        Crear y cargar un matriz de tamaño n x m, y mostrar la suma de cada fila y cada columa
        */
    Scanner scanner = new Scanner(System.in);

        // Pedir las dimensiones de la matriz
        System.out.print("Ingrese el número de filas (n): ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        // Cargar la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("\nMatriz ingresada:");
        mostrarMatriz(matriz, n, m);

        // Calcular y mostrar la suma de cada fila
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }

        // Calcular y mostrar la suma de cada columna
        System.out.println("\nSuma de cada columna:");
        for (int j = 0; j < m; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
        }
    }

    // Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}