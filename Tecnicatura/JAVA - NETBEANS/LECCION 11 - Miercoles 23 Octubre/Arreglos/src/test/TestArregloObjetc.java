
package test;

import domain.Persona;


public class TestArregloObjetc {
    public static void main(String[] args) {
        Persona personas[] = new Persona[3];
        
        personas[0] = new Persona("Persona 0");
        personas[1] = new Persona("Persona 1");
        personas[2] = new Persona("Persona 2");
        
        /*
        System.out.println("Persona 0: " + personas[0]);
        System.out.println("Persona 0: " + personas[1]);
        System.out.println("Persona 0: " + personas[2]);
        */
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona "+i+": " + personas[i]);
        }
    }
         
}
