package decoratorPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern
 * Date: 3/8/2018
 */
public class ColorDecorator extends CarDecorator {
    private Car car;
    public ColorDecorator(Car car1) {
        super("Color, ");
        car = car1;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + description;
    }

    @Override
    public int getCost() {
        return car.getCost() + 500;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel();
    }
}
