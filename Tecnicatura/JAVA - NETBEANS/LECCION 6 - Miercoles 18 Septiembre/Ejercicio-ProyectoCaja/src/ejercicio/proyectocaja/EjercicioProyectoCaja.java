package ejercicio.proyectocaja;

public class EjercicioProyectoCaja {

    public static void main(String[] args) {
        /*
        Proyecto CAJA:
            Ejerrcicio 1: Crear proyecto segun las especificaciones.
        La formula es: VOLUMEN = ANCHO * ALTO * PROFUNDIDAD
        
        Hay que hacerlo con 2 constructores, uno vacio y otro con valores  
        */
        
        Caja c = new Caja();
        Caja c1 = new Caja(2,4,3);
        
        System.out.println(c.calcularVolumen());
        System.out.println(c1.calcularVolumen());
        
    }
    

}
