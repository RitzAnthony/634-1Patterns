package strategyPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: strategyPattern.ex3
 * Date: 3/2/2018
 */
public class TestVehicle {

    public static void main (String [] args) {
        System.out.println("Pickup");
        Vehicle pickup = new Vehicle(new DieselEngine(), new DiscBrake());
        pickup.accelerate();
        pickup.brake();

        System.out.println("Minivan");
        Vehicle minivan = new Vehicle(new GasolineEngine(), new DrumBrake());
        minivan.accelerate();
        minivan.brake();

    }
}
