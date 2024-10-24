package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades: " + edades);
            
        edades[0] = 17;
        System.out.println("edades: " + edades[0]);
        // TAREA
        edades[1] = 1;
        System.out.println("edades: " + edades[1]);
        edades[2] = 2;
        System.out.println("edades: " + edades[2]);
        
        // Va a tirar una exepcion porq supere el limite
        //edades[3] = 3;
        //System.out.println("edades: " + edades[3]);
    
        for(int i = 0;i < edades.length;i++) {
            System.out.println("edaddes en for: " + edades[i]);
        }
    }
    

}
