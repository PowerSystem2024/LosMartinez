package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    
    public static void main(String[] args) {
       // Leer un numero y decis si es poitivo o negativo.
       // termina con 0
       
        int numero;
      //Scanner input = new Scanner(System.in);
      //System.out.print("Ingrese un numero (con 0 sale): ");
      //numero = input.nextInt();
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero (con 0 sale): "));
        
        while(numero != 0) {
            if(numero > 0) {
                System.out.println("POSITIVO");
            } else {
                System.out.println("NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese OTRO numero (con 0 sale): "));
        }
        
        System.out.println("INGRESO EL 0 - FIN!");
    }
}
