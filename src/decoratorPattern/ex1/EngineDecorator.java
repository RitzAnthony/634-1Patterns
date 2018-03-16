package decoratorPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern
 * Date: 3/8/2018
 */
public class EngineDecorator extends CarDecorator {
    private Car car;
    public EngineDecorator(Car car) {
        super("Engine, ");
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + description;
    }

    @Override
    public int getCost() {
        return car.getCost() + 5005;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 0;
    }
}
