package home.work.polimorfismas.uzduotisNR3;

import java.util.Random;

public class TeigemasSkaicius extends Class1 {
    private Random random = new Random();
    private int low = 1;
    private int max = 10;

    @Override
    public void generuok() {
        int[] d = new int[getSize()];
        for (int c = 0; c < d.length; c++) {
            d[c] = random.nextInt(max - low) + low;
        }
        setMasivas(d);

    }
}
