package factoryMethod.ex1;

import strategyPattern.ex3.*;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: factoryMethod
 * Date: 3/9/2018
 */
public class ToyotaCarFactory extends CarFactory{

    @Override
    public Vehicle createCar(String car) {
        if (car.equals("Pickup")) {
            return new Vehicle(new DieselEngine(), new DiscBrake());
        }
        if (car.equalsIgnoreCase("Minivan")) {
            return new Vehicle(new GasolineEngine(), new DrumBrake());
        }
        return null;
    }
}
