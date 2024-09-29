package pkg7.pkg2.ejercicio.ciclos.pkg11;

public class EjercicioCiclos11 {

   
    public static void main(String[] args) {
        // Mostrar producto de los 10 primeros numeros impares.
        
        int num =1;
        
        for(int i = 1;i <= 19;i += 2) {
            num *= i;
        }
        System.out.println("El producto es: " + num);
    }

}
