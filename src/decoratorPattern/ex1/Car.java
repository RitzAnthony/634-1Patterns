package decoratorPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern
 * Date: 3/8/2018
 */
public abstract class Car {
    protected String description;
    public Car (String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract int getCost();

    public abstract int getSecurityLevel();
}
