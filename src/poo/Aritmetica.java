package poo;

import java.util.Scanner;

public class Aritmetica {
    int operando1;
    int operando2;

    //Sobrecarga de constructores Constructir vacio
    public Aritmetica(){

    }

    //Constructor de la clase: con argumentos
    public Aritmetica (int op1, int op2){
        System.out.println("Constructor en java");
        this.operando1 = op1;
        this.operando2 = op2;
    }

    void sumar(){

        int resultado;
        resultado = operando1 + operando2;
        System.out.println("Resultado = " + resultado);
    }

    void restar(){

        var resultado = operando1 - operando2;
        System.out.println("Resultado = " + resultado);
    }


    public static void main(String[] args) {

        System.out.println("Aritmetica");
        var aritmetica = new Aritmetica(5,7);

//        aritmetica.operando1 = 10;
//        aritmetica.operando2 = 20;
        aritmetica.sumar();
        aritmetica.restar();
        System.out.println();
        var aritmatica2 = new Aritmetica();
        System.out.println("Dir en memoria: " + aritmetica);

    }
}
