package src.main.java.calculations;

import sensors.SensorReader;

public class OrientationCalculator {

    private final SensorReader sensor = new SensorReader();

    public OrientationCalculator() {

        double x = sensor.getX();
        double y = sensor.getY();
        double z = sensor.getZ();

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);
    }
}