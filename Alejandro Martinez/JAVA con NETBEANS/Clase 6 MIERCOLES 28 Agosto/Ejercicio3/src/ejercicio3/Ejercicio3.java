package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
/*  Ejercicio 3: Leer numeros hasta que se introduzca un cero.
    Para cada uno indicar si es par o impar
    Primero lo haremos con la clase Scanner  
*/
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int numero;
        
        
        System.out.println("Ingrese un numero: ");
        numero = imput.nextInt();
        
        while (numero != 0) {            
            
            if(numero % 2 == 0) {
                System.out.println("El numero " + numero + " es PAR");
            } else {
                System.out.println("El numero " + numero + " es IMPAR");
            }
            
            System.out.println("Ingrese un numero: ");
            numero = imput.nextInt();
        }
    }
}
