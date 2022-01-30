package home.work.polimorfismas.uzduotisNR2;

public class Duona extends Produktas{
    @Override
    public boolean arGalimaVartoti(int a) {
        return a == 1 || a == 2 || a == 3;
    }
}
