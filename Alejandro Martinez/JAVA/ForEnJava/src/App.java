public class App {
    public static void main(String[] args) throws Exception {
        // Imprimor los pares de 0 a 50
        int numero = 50;
        for(int i = 0; i < numero;i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
