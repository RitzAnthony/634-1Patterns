package decoratorPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern
 * Date: 3/8/2018
 */
public class CarBreak extends Car {
    public CarBreak() {
        super("CarBreak, ");
    }

    @Override
    public int getCost() {
        return 30000;
    }

    @Override
    public int getSecurityLevel() {
        return 3;
    }
}
