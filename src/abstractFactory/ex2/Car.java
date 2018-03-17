package abstractFactory.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1.abstractFactory.ex2
 * Date: 3/16/2018
 */
public abstract class Car {
    private String name;
    private Engine engine;

    public Car(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
