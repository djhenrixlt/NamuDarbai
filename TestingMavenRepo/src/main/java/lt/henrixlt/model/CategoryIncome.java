package lt.henrixlt.model;

public enum CategoryIncome {
    Alga("1"),
    Hobiai("2"),
    ParduotasDaiktas("3"),
    PasiskolinauIskaimyno("4"),
    BobutesPaskola("5");

    public final String value;

    CategoryIncome(String value) {
        this.value = value;
    }
}
