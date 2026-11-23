package poo.herencia.animales;

public class Perro extends Animal {

    @Override
    public void hacerSonido(){
        System.out.println("Soy un perro y puedo ladrar");
    }
    public static void main(String[] args) {
        var perro = new Perro();
        perro.hacerSonido();
    }
}