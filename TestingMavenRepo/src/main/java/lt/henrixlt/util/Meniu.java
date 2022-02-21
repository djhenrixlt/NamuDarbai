package lt.henrixlt.util;

import java.util.Scanner;

public class Meniu {
    public static void printMeniu() {
        System.out.println("1: inesti pinigu,\n" +
                "2: ivesti islaidas \n" +
                "3: paziureti islaidas\n" +
                "4: paziureti pajemas\n" +
                "5: gauti islaidas nuo iki\n" +
                "6: gauti pajemas nuo iki\n" +
                "7: pasirinkite kategorija kad gautumet islaidas\n" +
                "8: iveskite kategorija kad gautumet pajemas\n" +
                "9: iseiti is programos");
    }

    public static void printCategory() {
        System.out.println("Mokejimo budai: ");
        System.out.println("1: Card \n" +
                "2: Cash \n" +
                "3: Paypal\n" +
                "4: BTC \n" +
                "5 ETH\n" +
                "6: SOL");
    }

    public static void printCategoryIncome() {
        System.out.println("Kategorijos: ");
        System.out.println("1: Alga\n" +
                "2: Hobiai \n" +
                "3: Parduotas Daiktas \n" +
                "4: Pasiskolinau Is kaimyno \n" +
                "5: Bobutes Paskola");
    }

    public static void prinCategoryExpens() {
        System.out.println("Kategorijos: ");
        System.out.println("1: Maistas ir Buitis \n" +
                "2: Transportas \n" +
                "3: Atostogos ir keliones \n" +
                "4: Sveikata ir Grozis \n" +
                "5: Namai \n" +
                "6 kitos islaidos");
    }
}
