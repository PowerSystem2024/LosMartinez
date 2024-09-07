package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        double suma = 0;
        int contador = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero (con negativo): ");
        double numero = input.nextInt();
        
        while(numero >= 0) {
            suma += numero;
            contador++;
            System.out.print("Ingrese un numero (con negativo): ");
            numero = input.nextInt();
        }
        if (contador == 0) {
            System.out.println("No se ingresaron numeros");
        } else {
            System.out.println("La media es: " + (suma / contador));
        }
        
    }

}
