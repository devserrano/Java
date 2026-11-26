package temasAvanzados.clasesAbstractas;

public class ClaseAbstracta{

    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibijar();
        FiguraGeometrica figuraGeometrica1 = new Circurlo();
        figuraGeometrica1.dibijar();

    }
}



abstract class FiguraGeometrica{

    public abstract void dibijar();
}


class Rectangulo extends FiguraGeometrica{

    @Override
    public void dibijar() {
        System.out.println("Se dibuja un rectangulo");
    }
}

class Circurlo extends  FiguraGeometrica{

    @Override
    public void dibijar() {

        System.out.println("Dibuja un circulo");

    }
}