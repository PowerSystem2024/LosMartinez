
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        int resultado = Operaciones.sumar(2, 3);
        System.out.println("Resultado: " + resultado);
        
        double resultado2 = Operaciones.sumar(2, 3);
        System.out.println("Resultado: " + resultado2);
    }
}
