package poo.encapsulamiento;

public class Aritmetica {
    private int operando1;
    private int operando2;

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

    public int getOperando1(){
        return operando1;
    }

    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }
}
