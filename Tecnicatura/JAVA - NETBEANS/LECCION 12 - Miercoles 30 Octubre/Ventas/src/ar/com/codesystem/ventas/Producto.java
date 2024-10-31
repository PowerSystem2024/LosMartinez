
package ar.com.codesystem.ventas;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String n, double p) {
        this();
        nombre = n;
        precio = p;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
