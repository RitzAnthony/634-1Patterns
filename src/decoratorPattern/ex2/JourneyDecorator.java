package decoratorPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.abstractFactory.ex2
 * Date: 3/9/2018
 */
public abstract class JourneyDecorator extends Journey{
    private Journey journey;

    public JourneyDecorator(Journey journey, String description, int price) {
        this.journey = journey;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return journey.getDescription() + super.description;
    }

    @Override
    public int getPrice() {
        return journey.getPrice() + super.getPrice();
    }
}
