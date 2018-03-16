package decoratorPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.ex3
 * Date: 3/9/2018
 */
public class Color extends ShapeDecorator {
    private java.awt.Color color;

    protected Color(Shape shape, java.awt.Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.print("color:" + color.toString() + ", ");
    }
}
