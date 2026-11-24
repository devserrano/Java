package poo.encapsulamiento.persona;

public class Persona {

    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;


    public Persona (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        //Incrementat el atributo static
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;
    }

    @Override
    public String toString(){
        return "id del Usuario: "+ this.idPersona + " Nombre: " + this.nombre + ", Apellido: " + this.apellido + " "
                + super.toString();
    }


    void mostrarDetalle(){

        System.out.println("Nonbre: "+ this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }

}
