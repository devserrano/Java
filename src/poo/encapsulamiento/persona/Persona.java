package poo.encapsulamiento.persona;

public class Persona {


    private String nombre;
    private String apellido;


    public void persona (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Pasando por el constructor ");
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido + " "
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

}
