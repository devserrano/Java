package poo.herencia.animales;

public class Gato extends Animal{

    @Override
    protected void hacerSonido(){
        System.out.println("Soy un gato y puedo maullar");
    }

    public static void main(String[] args) {
        var gato = new Gato();
        gato.hacerSonido();
    }
}
