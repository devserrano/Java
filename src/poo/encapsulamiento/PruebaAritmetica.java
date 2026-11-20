package poo.encapsulamiento;

public class PruebaAritmetica {
    public static void main(String[] args) {

        System.out.println("Aritmetica");
        var aritmetica = new Aritmetica(5,7);
        System.out.println("Atributo Operando 1: " + aritmetica.getOperando1());
        aritmetica.setOperando1(255);
        System.out.println("Valor nuevo operando 1: "+ aritmetica.getOperando1());
        aritmetica.sumar();
        aritmetica.restar();
        System.out.println();
        var aritmatica2 = new Aritmetica();
        System.out.println("Dir en memoria: " + aritmetica);

    }
}
