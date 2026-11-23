package poo.encapsulamiento.persona;

public class ImplementacionPersona {

    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos de tipo persona: ");

        var persona = new Persona();
        persona.setApellido("Serrano");
        System.out.println("Apellido : " + persona.getApellido());
        persona.setApellido("Ramos");
        System.out.println("Apellido nuevo: " + persona.getApellido());
        persona.setNombre("Diego");

        System.out.println("Metodo toString:");
        System.out.println(persona); // Automaticamente se manda el metodo toString
    }
}
