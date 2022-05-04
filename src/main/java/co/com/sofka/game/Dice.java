package co.com.sofka.game;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Dice {
    private static final byte MINIMUM_VALUE = 1;
    private static final byte MAXIMUM_VALUE = 6;

    public Dice() {
    }

    public static byte launch() throws NoSuchAlgorithmException {
        Random random = SecureRandom.getInstanceStrong();
        return (byte)(random.nextInt(MINIMUM_VALUE - MAXIMUM_VALUE) + MINIMUM_VALUE);
    }
}
