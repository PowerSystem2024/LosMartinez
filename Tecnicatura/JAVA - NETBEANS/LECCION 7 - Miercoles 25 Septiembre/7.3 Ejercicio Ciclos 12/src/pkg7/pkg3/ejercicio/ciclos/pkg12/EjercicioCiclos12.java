package pkg7.pkg3.ejercicio.ciclos.pkg12;

import java.util.Scanner;

public class EjercicioCiclos12 {

    public static void main(String[] args) {
        // Pedir num y calculac factorial
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese num: ");
        int num = input.nextInt();
        int factorial = 1;
        
        if (num >= 1) {
            for(int i = num; i >= 1;i--) {
                factorial *= i;
            }
            System.out.println("El factorial es: " + factorial);
        } else {
            System.out.println("El numero tiene que ser mayor o igual a 1.");
        }
    }

}
