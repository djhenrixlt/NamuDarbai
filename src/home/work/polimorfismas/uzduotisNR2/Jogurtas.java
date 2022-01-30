package home.work.polimorfismas.uzduotisNR2;

public class Jogurtas extends Produktas{
    @Override
    public boolean arGalimaVartoti(int a) {
        return a == 1 || a == 2 ;
    }
}
