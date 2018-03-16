package decoratorPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern
 * Date: 3/8/2018
 */
public class BreakingSystemDecorator extends CarDecorator {
    private Car car;
    public BreakingSystemDecorator(Car car2) {
        super("BreakingSystem, ");
        car = car2;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + description;
    }

    @Override
    public int getCost() {
        return car.getCost() + 2050;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 3;
    }
}
