package domain;

public class Persona {
    private int id;
    private static int contador;
    private String nombre;
    
    // CONSTRUCTOR
    public Persona(String n) {
        nombre = n;
        // Incrementar el contador por cada objeto nuevo
        Persona.contador ++;
        this.id = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
