package domain;

// NO SE PUEDE POR QUE PERSONA ES FINAL
//public class Empleado extends Persona{
public class Empleado extends Persona{
    @Override
    public void imprimir() {
        System.out.println("Metodo imprimir de la clase hija");
    }
    //Persona.CONSTANTE_AQUI = 10;
}
