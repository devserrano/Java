package poo.encapsulamiento.persona;

public class ImplementacionPersona {

    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos de tipo persona: ");

        System.out.println();

        var persona = new Persona("Diego", "Serrano");
        System.out.println(persona.toString());
        System.out.println();
        System.out.println("Contador personas : " + Persona.getContadorPersonas());
        System.out.println();
        var persona2 = new Persona("Odil", "Montesino");
        System.out.println(persona2.toString());
         }


}
