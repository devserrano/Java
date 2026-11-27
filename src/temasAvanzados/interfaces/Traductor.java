package temasAvanzados.interfaces;

import jdk.swing.interop.SwingInterOpUtils;

public interface Traductor {

    void traducir();

    //Metodos con impelmentacion por default

    default void iniciarTraductor(){
        System.out.println("Iniciando Traductor");
    }
}


class Ingles implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduzco a ingles");
    }
}

class PruebaTraductor{

    public static void main(String[] args) {

        Traductor traductor = new Ingles();
        traductor.traducir();


        Traductor traductorFran = new Frances();
        traductorFran.iniciarTraductor();
        traductorFran.traducir();
    }
}

class Frances implements Traductor {

    @Override
    public void traducir() {

        System.out.println("Se traducir en Frances");

    }

    @Override
    public void iniciarTraductor() {
        Traductor.super.iniciarTraductor();
    }
}
