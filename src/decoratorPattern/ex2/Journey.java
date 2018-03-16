package decoratorPattern.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.abstractFactory.ex2
 * Date: 3/9/2018
 */
public abstract class Journey {
    protected String description = "";
    protected int price = 0;

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
