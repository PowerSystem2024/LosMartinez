package pkg8.pkg1.encapsulamiento.parte.pkg2;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Ale","Martinez");
        // TAREA: Crear otro objeto tipo Persona, asignar valores de manera inicial.
        Persona p2 = new Persona("Lautaro","Martinez");
        System.out.println(p1.toString());
        
        // IMPRIMIR Y LUEGO MODIFICAR LOS VALORES
        System.out.println(p2.toString());
          
        p2.setNombre("CAMBIO NOMBRE");
        p2.setApellido("CAMBIO APELLIDO");
        // VUELVO A IMPRIMIR
        System.out.println(p2.toString());
    }

}
