package co.com.sofka.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static co.com.sofka.util.Number.DIEZ_MIL;
import static co.com.sofka.util.Number.UNO;
import static co.com.sofka.util.UnitMeasure.METROS;

public class Race {
    private static Scanner read = new Scanner(System.in);
    private static final String NAME_TRACK = "Solaris";
    private String id;
    private byte numberPlayers;
    private List<Driver> drivers;
    private Track track = new Track();
    private List<Lane> lanes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(byte numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public void configure() {
        drivers = new ArrayList<>();
        track.setId(String.valueOf(UNO.getValue()));
        track.setName(NAME_TRACK);
        track.setDistance(DIEZ_MIL.getValue());
        track.setUnitMeasure(METROS.getValue());

        lanes = new ArrayList<>();

        for (int i = 0; i < numberPlayers; i++) {
            System.out.println("Ingrese los datos del conductor: " + (i + 1));
            Driver driver = new Driver();
            System.out.println("Identificador del jugador: ");
            driver.setId(read.nextLine());
            System.out.println("Apodo: ");
            driver.setNickname(read.nextLine());
            System.out.println("Edad: ");
            driver.setAge(read.nextByte());

            System.out.println("Ingrese los datos del vehiculo: " + (i + 1));
            Car car = new Car();
            System.out.println("Identificador del vehiculo: ");
            car.setId(read.nextLine());
            System.out.println("Modelo: ");
            car.setModel(read.nextLine());
            System.out.println("Marca: ");
            car.setBrand(read.nextLine());
            System.out.println("Linea: ");
            car.setLine(read.nextLine());

            driver.setCar(car);
            drivers.add(driver);

            Lane lane = new Lane();
            lane.setId(String.valueOf((i + 1)));
            lane.setCar(car);
            lanes.add(lane);
        }
        track.setLanes(lanes);
    }

}
