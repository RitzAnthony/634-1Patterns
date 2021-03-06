package decoratorPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.abstractFactory.ex2
 * Date: 3/9/2018
 */
public class Hotelroom extends JourneyDecorator {

    public Hotelroom(Journey journey) {
        super(journey, "Hotelroom, ", 1200);
    }
}
