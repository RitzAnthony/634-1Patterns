package decoratorPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern
 * Date: 3/8/2018
 */
public class AirbagDecorator extends CarDecorator {
    private Car car;
    public AirbagDecorator(Car car) {
        super("Airbag, ");
        this.car = car;
    }


    @Override
    public int getCost() {
        return car.getCost() + 800;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 1;
    }


    @Override
    public String getDescription() {
        return car.getDescription() + description;
    }
}
