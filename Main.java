import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    Cajero [] cajerosEnBanco = new Cajero[5];

    cajerosEnBanco [0] = new Cajero("cajero1");
    cajerosEnBanco [1] = new Cajero("cajero2");
    cajerosEnBanco [2] = new Cajero("cajero3");
    cajerosEnBanco [3] = new Cajero("cajero4");
    cajerosEnBanco [4] = new Cajero("cajero5");


        for (int i = 0; i < cajerosEnBanco.length; i++) {
            cajerosEnBanco[i].getReporte();
        }



    }


}
