package lt.henrixlt.model;

public enum CategoryExpenses {

    MaistasIrBiutis("1"),
    Transportas("2"),
    AtostogosIrkeliones("3"),
    SveikataIrGrozis("4"),
    Namai("5"),
    KitosIslaidos("6");

    public final String value;

    CategoryExpenses(String value) {
        this.value = value;
    }
}
