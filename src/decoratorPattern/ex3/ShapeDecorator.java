package decoratorPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: decoratorPattern.ex3
 * Date: 3/9/2018
 */
public abstract class ShapeDecorator implements Shape {
    private Shape shape;

    protected ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}

