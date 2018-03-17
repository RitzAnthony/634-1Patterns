package abstractFactory.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex2
 * Date: 3/17/2018
 */
public abstract class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
