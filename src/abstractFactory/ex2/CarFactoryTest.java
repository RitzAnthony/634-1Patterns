package abstractFactory.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1.abstractFactory.ex2
 * Date: 3/16/2018
 */
public class CarFactoryTest {
    public static void main(String[] args) {
        AbstractCarFactory carFactory1 = new PickupFactory();
        Car car1 = carFactory1.buildCar();
        System.out.println(car1);

        AbstractCarFactory carFactory2 = new CoupeFactory();
        Car car2 = carFactory2.buildCar();
        System.out.println(car2);

        AbstractCarFactory carFactory3 = new MinivanFactory();
        Car car3 = carFactory3.buildCar();
        System.out.println(car3);
    }
}
