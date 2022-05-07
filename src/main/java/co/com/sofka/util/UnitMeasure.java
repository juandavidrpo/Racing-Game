package co.com.sofka.util;

public enum UnitMeasure {
    KM("Kilometros"),
    METROS("Metros");

    private String value;

    public String getValue() {
        return value;
    }

    UnitMeasure(String value) {
        this.value = value;
    }
}
