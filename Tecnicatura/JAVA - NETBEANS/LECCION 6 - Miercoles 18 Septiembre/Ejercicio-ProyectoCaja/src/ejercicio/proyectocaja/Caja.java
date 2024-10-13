package ejercicio.proyectocaja;

public class Caja {
    private double ancho;
    private double alto;
    private double profundidad;
    
    public Caja(){
        this(0,0,0);
    }
    
    public Caja(double ancho,double alto,double profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    // La formula es: VOLUMEN = ANCHO * ALTO * PROFUNDIDAD
    public double calcularVolumen() {
        return ancho * alto * profundidad;
    }
}
