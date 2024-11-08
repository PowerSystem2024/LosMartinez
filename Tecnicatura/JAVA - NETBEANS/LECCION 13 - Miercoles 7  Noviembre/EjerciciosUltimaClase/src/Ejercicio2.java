
import java.util.Scanner;

public class Ejercicio2 {
/*
Leer por teclado dos tablas de 10 numeros enteros.
Y mezclarlos en una tercera de la forma:
el 1º de A, el 1º de B
el 2º de A, el 2 de B, etc    
*/
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaMezclada = new int[20];

        System.out.println("Introduce 10 números para la primera tabla (A):");
        for (int i = 0; i < 10; i++) {
            tablaA[i] = scanner.nextInt();
        }
        System.out.println("Introduce 10 números para la segunda tabla (B):");
        for (int i = 0; i < 10; i++) {
            tablaB[i] = scanner.nextInt();
        }
        int indiceMezclado = 0;
        for (int i = 0; i < 10; i++) {
            tablaMezclada[indiceMezclado++] = tablaA[i]; // Insertar elemento de A
            tablaMezclada[indiceMezclado++] = tablaB[i]; // Insertar elemento de B
        }
        System.out.println("\nTabla mezclada:");
        for (int i = 0; i < 20; i++) {
            System.out.print(tablaMezclada[i] + " ");
        }
        scanner.close();
    }
}
