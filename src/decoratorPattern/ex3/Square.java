package decoratorPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.ex3
 * Date: 3/9/2018
 */
public class Square implements Shape {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.print("Square: width:" + width + ", ");
    }
}
