package decoratorPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern
 * Date: 3/8/2018
 */
public abstract class CarDecorator extends Car {

    public CarDecorator(String description) {
        super(description);
    }

    public abstract String getDescription();
}
