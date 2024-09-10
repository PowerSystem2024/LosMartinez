package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Ejercicio 4: Pedir numeros hasta que se teclee un negativo y mostrar cuantos numeros se han introducido.
        // Lo hacemos primero con Scanner
        
        int numero = 0;
        int contador = 0;
        Scanner imput = new Scanner(System.in);
        
        System.out.println("Ingrese numero: ");
        numero = imput.nextInt();
        
        while(numero >= 0) {          
         
            contador++;
            System.out.println("Ingrese numero: ");
            numero = imput.nextInt();
        }
        System.out.println("Ingreso " + contador + " numeros positivos");
    }

}
