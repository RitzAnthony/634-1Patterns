package lab14;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab14
 * Date: 5/21/2018
 */
public abstract class Lettuce {
    private String name;

    public Lettuce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
