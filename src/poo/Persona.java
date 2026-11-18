package poo;

public class Persona {


    String nombre;
    String apellido;


    void mostrarDetalle(){

        System.out.println("Nonbre: "+ nombre);
        System.out.println("Apellido: " + apellido);

    }


    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos de tipo persona: ");

        var objeto1 = new Persona();
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";

        objeto1.mostrarDetalle();


    }

}
