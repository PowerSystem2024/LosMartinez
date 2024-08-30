package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        /* Ejercicio 5: Realizar un juego para adivinar un numero para ellos generar uno aleatorio entre 0-100
        y luego ir pidiendo numeros indicando "es mayor" o "es menor" segun sea con respecto al numero random
        El proceso termina cuando el usuario acierta mostrando la cantidad de intentos hechos    
        */
        
        int numero = (int) (Math.random() * 100) + 1;
        System.out.println("El numero random es: " + numero);
        int numeroUsuario = -1;
        Scanner imput = new Scanner(System.in);
        
        while(numero != numeroUsuario) {
            System.out.print("Ingrese numero: ");
            numeroUsuario = imput.nextInt();
            
            if (numero > numeroUsuario) {
                System.out.println("Es Mayor");
            } else if(numero < numeroUsuario){
                System.out.println("Es Menor");
            }
        }
        System.out.println("Usted ha adivinado!!!");
    }

}
