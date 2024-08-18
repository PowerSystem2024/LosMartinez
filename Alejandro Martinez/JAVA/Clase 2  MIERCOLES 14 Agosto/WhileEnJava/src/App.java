import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int contraseña;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la contraseña (es 123): ");
        contraseña = input.nextInt();

        while(contraseña != 123) {
            System.out.println("ERROR... Reingrese la contraseña (es 123): ");
            contraseña = input.nextInt();
        }
        System.err.println("Usted ha ingresado al sistema!!!");
        input.close();
    }
}