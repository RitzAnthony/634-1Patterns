package decoratorPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.ex3
 * Date: 3/9/2018
 */
public class Border extends ShapeDecorator{
    private Thickness thickness;
    protected Border(Shape shape, Thickness thickness) {
        super(shape);
        this.thickness = thickness;
    }

    public enum Thickness {
        SMALL, MEDIUM, BIG;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.print("thickness: " + thickness + ", ");
    }
}
