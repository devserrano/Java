package funciones;

import java.util.Scanner;

public class FuncionPar {

    static boolean esPar(int numero){
        boolean esPar = false;

      //  if (numero % 2 == 0){
      //      esPar = true;
      //  }else{
      //      esPar = false;
      //  }

        return (numero % 2 == 0)? true: false;
    }

  //  public static void main(String[] args) {
   //     System.out.print("Proporciona un valor numerico: ");
  //      var numero = Integer.parseInt(new Scanner(System.in).nextLine());
   //     System.out.println("Su numero es par? : " + esPar(numero));
    //}
}
