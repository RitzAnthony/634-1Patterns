package decoratorPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.abstractFactory.ex2
 * Date: 3/9/2018
 */
public class Flat extends JourneyDecorator {

    public Flat(Journey journey) {
        super(journey, "flat, ", 200);
    }
}
