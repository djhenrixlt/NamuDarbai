package home.work.polimorfismas.uzduotisNR3;

import java.util.Random;

public abstract class Class1 {
    private Random random = new Random();
    private int low = 20;
    private int max = 200;
    private int size = random.nextInt(max - low) + low;
    private int[] masivas;

    public Class1() {
        this.masivas = new int[this.size];
    }

    public abstract void generuok();

    public int suma() {
        int suma = 0;
        for (int c = 0; c < this.masivas.length; c++) {
            suma += this.masivas[c];
        }
        return suma;
    }

    public int getSize() {
        return size;
    }

    public int[] getMasivas() {
        return masivas;
    }

    public void setMasivas(int[] masivas) {
        this.masivas = masivas;
    }
}
