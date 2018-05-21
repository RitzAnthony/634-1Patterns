package lab14;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab14
 * Date: 5/21/2018
 */
public abstract class GreekSaladDecorator extends GreekSalad {
    protected GreekSalad greekSalad;

    public GreekSaladDecorator(GreekSalad greekSalad) {
        this.greekSalad = greekSalad;
    }

    @Override
    public abstract String toString();
}
