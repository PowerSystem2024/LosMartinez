
package tarea2;

import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        /*
        Leer 5 numeros, guardarlos en un arreglo y mostrar en orden inverso
        */
         int numeros[] = new int[5];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero("+(i+1)+"): ");
            numeros[i] = input.nextInt();    
        }
        System.out.print("Array de numeros: ");  
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i] + " - ");  
        }
    }
}
