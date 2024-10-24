package tareamatriz;


public class Ejercicio4 {

    public static void main(String[] args) {
        /*
        Crear matriz 7x7 rellenarla de forma que los elementos diagonal principal sean 1 y el resto 0
        */
         int[][] matriz = new int[7][7];

        // Rellenar la matriz con 1 en la diagonal principal y 0 en el resto
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Diagonal principal
                } else {
                    matriz[i][j] = 0; // Resto de elementos
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz 7x7 con 1 en la diagonal principal y 0 en el resto:");
        mostrarMatriz(matriz);
    }

    // Método para mostrar una matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}