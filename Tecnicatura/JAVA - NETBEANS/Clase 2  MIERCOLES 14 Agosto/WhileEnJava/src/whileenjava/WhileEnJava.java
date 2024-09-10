
package whileenjava;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class WhileEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contraseña;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese contraseña (123): ");
        contraseña = input.nextInt();
        
        while(contraseña != 123) {
            System.out.print("ERROR... Reingrese contraseña (123): ");
            contraseña = input.nextInt();
        }
        System.out.println("INGRESO!!!!");
    }

}
