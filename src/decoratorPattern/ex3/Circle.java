package decoratorPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.ex3
 * Date: 3/9/2018
 */
public class Circle implements Shape {
    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void draw() {
        System.out.print("Circle: diameter:" + diameter + ", ");
    }
}
