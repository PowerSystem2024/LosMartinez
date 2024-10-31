package VentasTest;

import ar.com.codesystem.ventas.Orden;
import ar.com.codesystem.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        // Tarea:
        // Crear mas objetos de tipo Producto
        // Cear mas ordenes
        
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();
        
        Producto producto3 = new Producto("Ojotas", 9500.00);
        Producto producto4 = new Producto("Remera", 9900.00);
        Producto producto5 = new Producto("Buzo", 19500.00);
        Producto producto6 = new Producto("Chomba", 10900.00);
        
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto6);
        
        orden2.mostrarOrden();
        orden3.mostrarOrden();
        
        
        
    }
}
