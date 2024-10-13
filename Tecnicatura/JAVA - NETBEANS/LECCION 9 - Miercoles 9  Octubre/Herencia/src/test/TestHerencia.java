package test;

import doMain.Cliente;
import doMain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ale",10000);
        System.out.println("empleado1: " + empleado1);
        
        Date fecha1 = new Date(); 
        
        Cliente cliente1 = new Cliente(fecha1,true,"Ale",'F',32,"Calle falsa 123");
        System.out.println("cliente1: " + cliente1);
    }

}
