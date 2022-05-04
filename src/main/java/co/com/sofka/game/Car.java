package co.com.sofka.game;

public class Car {
    private String id;
    private String model;
    private String brand;
    private String line;
    private long advancedDistance;
    private static final byte FACTOR_PROGRESS = 100;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public long getAdvancedDistance() {
        return advancedDistance;
    }
}
