package poo.ejemplos.sistemaVenta;

public class Producto {

    private static int contadorProductos = 0;
    private String nombre;
    private double precio;
    private final int idProducto;

    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;

        Producto.contadorProductos++;
        idProducto = Producto.contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{ " +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", idProducto=" + idProducto +
                '}';
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
