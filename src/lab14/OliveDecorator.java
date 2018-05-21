package lab14;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab14
 * Date: 5/21/2018
 */
public class OliveDecorator extends GreekSaladDecorator {
    public OliveDecorator(GreekSalad greekSalad) {
        super(greekSalad);
    }
    @Override
    public String toString() {
        return greekSalad.toString() + " + olive decoration";
    }
}
