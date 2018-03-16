package decoratorPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern
 * Date: 3/8/2018
 */
public class AntiSlidingSystemDecorator extends CarDecorator {
    private Car car;
    public AntiSlidingSystemDecorator(Car car2) {
        super("AntiSliding, ");
        car = car2;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + description;
    }

    @Override
    public int getCost() {
        return car.getCost() + 1200;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 2;
    }
}
