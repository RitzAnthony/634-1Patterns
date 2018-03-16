package factoryMethod.ex1;

import strategyPattern.ex3.Vehicle;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: factoryMethod
 * Date: 3/9/2018
 */
public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory toyotaFactory = new ToyotaCarFactory();

        Vehicle pickup = toyotaFactory.buildCar("Pickup");
        Vehicle minivan = toyotaFactory.buildCar("Minivan");
    }

}
