package forhastanumnegativo;

import java.util.Scanner;

public class ForHastaNumNegativo {

    public static void main(String[] args) {
        // Leer numero y mostrar su cuadrado, repetir el proceso hasta
        // que se introduzca un numero negativo
        int numero;
        int cuadrado;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero (con negativo sale): ");
        numero = input.nextInt();
        
        while(numero >= 0) {
            cuadrado = (int) Math.pow(numero,2);
            System.out.println("El cuadrado del numero " + numero + " es : " + cuadrado);
            System.out.print("Ingrese OTRO numero (con negativo sale): ");
            numero = input.nextInt();
        }
        
        System.out.println("INGRESO UN NUMERO NEGATIVO ("+numero+") FIN!");
    }

}
