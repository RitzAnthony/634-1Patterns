package abstractFactory.prototypePattern;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.prototypePattern
 * Date: 3/22/2018
 */
public class Brake implements Cloneable{
    private String name;
    private int diameter;

    public Brake(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
            return super.clone();
    }

    @Override
    public String toString() {
        return "Brake{" +
                "name='" + name + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
