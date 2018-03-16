package abstractFactory.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1.abstractFactory.ex2
 * Date: 3/16/2018
 */
public class CarFactoryTest {
    public static void main(String[] args) {
        AbstractCarFactory carFactory = new ConcreteCarFactory();

        Car car1 = carFactory.createCar("Minivan");
        System.out.println(car1);

        Car car2 = carFactory.createCar("Pickup");
        System.out.println(car2);

        Car car3 = carFactory.createCar("Coupe");
        System.out.println(car3);
    }
}
