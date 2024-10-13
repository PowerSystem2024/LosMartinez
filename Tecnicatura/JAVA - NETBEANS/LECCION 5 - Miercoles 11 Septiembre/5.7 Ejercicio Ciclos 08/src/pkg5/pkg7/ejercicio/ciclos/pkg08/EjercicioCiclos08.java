package pkg5.pkg7.ejercicio.ciclos.pkg08;

import java.util.Scanner;

public class EjercicioCiclos08 {

    public static void main(String[] args) {
        // Pedir un num N y mostrar de 1 a N
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese num: ");
        int num = scan.nextInt();
        
        for(int i = 1; i <= num;i++) {
            System.out.print(i + " ");
        }
    }

}
