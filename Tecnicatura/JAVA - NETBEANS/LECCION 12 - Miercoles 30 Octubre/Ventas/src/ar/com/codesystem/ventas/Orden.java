package ar.com.codesystem.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorPorductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
       
    public void agregarProducto(Producto producto) {
        if(this.contadorPorductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorPorductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos: (" + Orden.MAX_PRODUCTOS + ")");
        }
    }
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorPorductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("El total de la orden es: $"+totalOrden);
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorPorductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
