package temasAvanzados;

public class ArgumentosVariables {


    public static void main(String[] args) {

        imprimirNumeros(1,2,3,4,5); // varargs

        variosParametros("Karla", 10, 29 , 39);

    }

    static void variosParametros(String nombre, int ... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int ...numero) {
        for(int i = 0; i < numero.length; i++){
            System.out.print(" " + numero[i]);
        }
    }
}
