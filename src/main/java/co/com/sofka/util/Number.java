package co.com.sofka.util;

public enum Number {
    UNO(1),
    DOS(2),
    DIEZ_MIL(10000);

    private int value;

    public int getValue() {
        return value;
    }

    Number(int value) {
        this.value = value;
    }

}
