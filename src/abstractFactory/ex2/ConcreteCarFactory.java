package abstractFactory.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1.abstractFactory.ex2
 * Date: 3/16/2018
 */
public class ConcreteCarFactory extends AbstractCarFactory {
    @Override
    public Car createCar(String carname) {
        if (carname.equals("Minivan")) return new Minivan();
        if (carname.equals("Pickup")) return new Pickup();
        return new Coupe();
    }
}
