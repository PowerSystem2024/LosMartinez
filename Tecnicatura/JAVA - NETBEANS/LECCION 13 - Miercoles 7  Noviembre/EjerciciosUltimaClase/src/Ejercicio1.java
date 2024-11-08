import java.util.Scanner;

public class Ejercicio1 {
    /*
    Leer 10 nums enteros
    Guardarlos en un arreglo.
    Debemos mostrarlo en el siguiente         
    orden: El primero,el ultimo, el segundo, el penultimo, el tercero, etc
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("\nLos números en el orden solicitado son:");
        int i = 0, j = 9;
        while (i <= j) {
            System.out.print(arreglo[i] + " ");  // Mostrar el elemento i-ésimo
            if (i != j) {
                System.out.print(arreglo[j] + " ");  // Mostrar el elemento j-ésimo, solo si i != j
            }
            i++;
            j--;
        }
        scanner.close();
    }
}
