package abstractFactory.ex1.window;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1.window
 * Date: 3/16/2018
 */
public abstract class Window {
    private String name;

    public Window(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
