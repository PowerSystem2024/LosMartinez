package pkg5.pkg8.ejercicio.ciclos.pkg09;

import java.util.Scanner;

public class EjercicioCiclos09 {

    public static void main(String[] args) {
       // Mostrar si la fecha es correcta o incorrecta, los meses hacerlos de 30 dias
       Scanner input = new Scanner(System.in);
       int dia;
       int mes;
       int anio;
       
        System.out.print("Ingrese dia: ");
        dia = input.nextInt();
        if (dia > 0 && dia < 31) {
            System.out.print("Ingrese mes: ");
            mes = input.nextInt();
            if (mes > 0 && mes < 12) {
                System.out.print("Ingrese año: ");
                 anio = input.nextInt();
                 if (anio > 1850 && anio < 2025) {
                     System.out.println("La fecha es: " + dia + "/" + mes + "/" + anio);
                } else {
                     System.out.println("ANIO INCORRECTO");
                }
            } else {
                System.out.println("MES ERRONEO");
            }
        } else {
            System.out.println("DIA ERRONEO");
        }
        
        
        
        
        
       
       
       input.close();
    }

}
