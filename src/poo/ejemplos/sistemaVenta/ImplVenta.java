package poo.ejemplos.sistemaVenta;

public class ImplVenta {

    public static void main(String[] args) {
        System.out.println("*** Sistema de ventas ***");
        var producto1 = new Producto("Tenis", 1590.50);
        var producto2 = new Producto("Gorra", 599);

        //Objeto de tipo orden

        var orden1 = new Orden();
            orden1.agregarProducto(producto1);
            orden1.agregarProducto(producto2);
            orden1.mostrarTotal();



        //Segunda orden

        var orden2 = new Orden();
        var producto3 = new Producto("Zapatos", 1000);
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.mostrarTotal();


    }
}
