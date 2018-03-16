package factoryMethod.ex1;

import strategyPattern.ex3.Vehicle;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: factoryMethod
 * Date: 3/9/2018
 */
public abstract class CarFactory {

    public Vehicle buildCar(String car) {
        Vehicle vehicle;

        System.out.println("Begin to build a car: ");
        vehicle = createCar(car);
        System.out.println(vehicle);
        System.out.println("Build of the car completed.");

        return  vehicle;
    }
    public abstract Vehicle createCar(String car);

}
