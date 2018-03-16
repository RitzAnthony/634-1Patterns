package abstractFactory.ex1.door;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1.door
 * Date: 3/16/2018
 */
public abstract class Door {
    private String name;

    public Door(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
