package decoratorPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.ex3
 * Date: 3/9/2018
 */
public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.print("Rectangle: width:" + width +
                " height:" + height + ",");
    }
}
