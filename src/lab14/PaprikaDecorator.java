package lab14;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab14
 * Date: 5/21/2018
 */
public class PaprikaDecorator extends GreekSaladDecorator {
    public PaprikaDecorator(GreekSalad greekSalad) {
        super(greekSalad);
    }

    @Override
    public String toString() {
        return greekSalad.toString() + " + paprika decoration";
    }
}
