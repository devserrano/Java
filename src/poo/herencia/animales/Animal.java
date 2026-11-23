package poo.herencia.animales;

public class Animal {

    protected void hacerSonido(){
        System.out.println("Puedo hacer sonido");
    }

    class pruebaAnimal {

        static void imprimirSonido(Animal animal) {
            animal.hacerSonido();

        }

        public static void main(String[] args) {
            var animal = new Animal();
            imprimirSonido(animal);

        }
    }
}
