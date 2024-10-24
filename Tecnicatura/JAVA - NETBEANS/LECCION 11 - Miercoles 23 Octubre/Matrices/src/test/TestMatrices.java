
package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        // FILAS - COLUMNAS
        int edades[][] = new int[3][2];
        System.out.println("Edades: " +edades);
        
        edades[0][0] = 5;
        edades[0][1] = 4;
        edades[1][0] = 7;
        edades[1][1] = 9;
        edades[2][0] = 5;
        edades[2][1] = 1;
        
        
    
    
    // Creamos matriz de objetos
        Persona personas[][] = new Persona[3][3];
        personas[0][0] = new Persona("Ale");
        personas[0][1] = new Persona("Ariel");
        personas[1][0] = new Persona("Panda");
        personas[1][1] = new Persona("Facu");
        personas[2][0] = new Persona("Jose");
        personas[2][1] = new Persona("Manu");
        
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Edades: " + i + "-" + j+": "+ matriz[i][j]);
            }
        }
    }
}
