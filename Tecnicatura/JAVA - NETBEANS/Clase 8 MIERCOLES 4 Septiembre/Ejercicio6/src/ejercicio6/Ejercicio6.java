package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

   
    public static void main(String[] args) {
        
        int suma = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero (con 0 salimos): ");
        int numero = input.nextInt();
        
        while(numero != 0) {
            suma+= numero;
            System.out.print("Ingrese un numero (con 0 salimos): ");
            numero = input.nextInt();
        }
        System.out.println("Ha salido! - LA SUMA ES: " + suma);
    }

}
