package proyecto.integrador.grupal.java;

import java.util.Scanner;

public class ProyectoIntegradorGrupalJAVA {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean seguirMenu = true;
        int opcion;
        
        while (seguirMenu) {            
            System.out.println(" - - - - ABM ESTUDIANTES/PROFESORES - - - - ");
            System.out.println("");
            System.out.println("1. Alta usuario");
            System.out.println("2. Baja usuario");
            System.out.println("3. Modificar usuario");
            System.out.println("4. Listados");
            System.out.println("10. SALIR");
            System.out.println("");
            System.out.print("Ingrese opcion: ");
            opcion = input.nextInt();
            
            switch (opcion) {
                case 1 -> System.out.println("dar alta usuario...");
                case 2 -> System.out.println("dar baja usuario...");
                case 3 -> System.out.println("modificando usuario...");
                case 4 -> System.out.println("cargando listados...");
                case 10 -> {
                    System.out.println("USTED HA SALIDO!!!");
                    seguirMenu = false;
                }
                default -> System.out.println("opcion incorrecta...");
            }
        }
    }
}
