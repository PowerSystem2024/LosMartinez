
package tarea3;

import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        /*
        Leer 5 numeros, guardarlos en un arreglo y hacer la media de los numeros positivos, la media de los negativos
        y contar los 0
        */
         int numeros[] = new int[5];
         float acumuladorPositivos = 0;
         float acumuladorNegativos = 0;
         int contadorCeros = 0;
         float mediaPositivos;
         float mediaNegativos;
         
         
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero("+(i+1)+"): ");
            numeros[i] = input.nextInt();    
            if (numeros[i] > 0) {
                acumuladorPositivos +=numeros[i];
            } else if(numeros [i] < 0) {
                acumuladorNegativos += numeros[i];
            } else {
                contadorCeros++;
            }
        }
        mediaPositivos = acumuladorPositivos / 5;
        mediaNegativos = acumuladorNegativos / 5;
        
        System.out.println("Media positivos: " + mediaPositivos);
        System.out.println("Media negativos: " + mediaNegativos);
        System.out.println("Contador ceros : " + contadorCeros);
    }
}
