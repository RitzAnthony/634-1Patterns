package decoratorPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern
 * Date: 3/8/2018
 */
public class CarBerlin extends Car {

    public CarBerlin() {
        super("Car berlin, ");
    }

    @Override
    public int getCost() {
        return 99000;
    }

    @Override
    public int getSecurityLevel() {
        return 1;
    }
}
