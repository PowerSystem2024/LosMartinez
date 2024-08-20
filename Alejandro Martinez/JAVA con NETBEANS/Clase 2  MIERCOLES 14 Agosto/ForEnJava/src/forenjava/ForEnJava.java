
package forenjava;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class ForEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mostrar PARES de 0 a 50
        for(int i = 0; i <= 50; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
