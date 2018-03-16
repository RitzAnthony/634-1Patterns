package decoratorPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.abstractFactory.ex2
 * Date: 3/9/2018
 */
public class Wellnessservice extends JourneyDecorator {
    public Wellnessservice(Journey journey) {
        super(journey, "wellnessservice, ", 95);
    }
}
