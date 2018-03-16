package decoratorPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern
 * Date: 3/8/2018
 */
public class CarSport extends Car {
    public CarSport() {
        super("Sport car, ");
    }

    @Override
    public int getCost() {
        return 50000;
    }

    @Override
    public int getSecurityLevel() {
        return 0;
    }
}
