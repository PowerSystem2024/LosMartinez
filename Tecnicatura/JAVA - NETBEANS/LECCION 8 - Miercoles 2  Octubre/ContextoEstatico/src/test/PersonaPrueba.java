package test;

import domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Ale");
        Persona p2 = new Persona("Ale2");
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
        
        imprimir(p1);
        imprimir(p2);
    }
    
    public static void imprimir(Persona p) {
        System.out.println("persona= " + p);
    }
}
