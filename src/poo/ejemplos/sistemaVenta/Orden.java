package poo.ejemplos.sistemaVenta;

public class Orden {

    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de produtos " + Orden.MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
        double total = 0;

        for(int i = 0 ; i < this.contadorProductos ; i++) {

            total += productos[i].getPrecio();

        }
        return total;
    }


    public void mostrarTotal() {
        System.out.println("id orden: " + this.idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("total de la orden: $" + totalOrden);

        System.out.println("Produtos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(productos[i].toString());
        }
    }
}
