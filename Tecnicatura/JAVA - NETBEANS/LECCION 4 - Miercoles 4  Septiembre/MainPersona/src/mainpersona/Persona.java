package mainpersona;


public class Persona {
    private String nombre;
    private String apellido;
    
    public Persona(String n, String a) {
        nombre = n;
        apellido = a;
    }
    
    @Override
    public String toString(){
       return "Nombre: " + nombre + " - Apellido: " + apellido;
    }
}
