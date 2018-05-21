package lab14;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab14
 * Date: 5/21/2018
 */
public class ChiefGreekSaladFactory extends GreekSaladFactory {
    @Override
    protected Lettuce getLettuce() {
        return new ChineseLettuce();
    }

    @Override
    protected Cucumber getCucumber() {
        return new BigSliceCucumber();
    }

    @Override
    protected Tomato getTomato() {
        return new NormalTomato();
    }
}
