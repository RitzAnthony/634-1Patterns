package lab14;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab14
 * Date: 5/21/2018
 */
public abstract class Cucumber {
    private String name;

    public Cucumber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
