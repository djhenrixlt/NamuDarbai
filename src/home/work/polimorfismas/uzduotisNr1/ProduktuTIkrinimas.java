package home.work.polimorfismas.uzduotisNr1;

import java.util.Random;

public class ProduktuTIkrinimas {
    public static void main(String[] args) {
        Duona duona = new Duona();
        Jogurtas jogurtas = new Jogurtas();
        PIenas pIenas = new PIenas();
        Sviestas sviestas = new Sviestas();
        Suris suris = new Suris();
        Random number = new Random();
        int c = number.nextInt(10);
        System.out.println(suris.arGalimaVartoti(c));

    }
}
