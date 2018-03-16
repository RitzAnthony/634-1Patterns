package decoratorPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.ex3
 * Date: 3/9/2018
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        shape1 = new Border(shape1, Border.Thickness.SMALL);
        shape1 = new Color(shape1, java.awt.Color.BLUE);
        shape1.draw();
        System.out.println();

        Shape shape2 = new Rectangle(3, 4);
        shape2 = new Border(shape2, Border.Thickness.MEDIUM);
        shape2 = new Color(shape2, java.awt.Color.RED);
        shape2.draw();
    }
}
