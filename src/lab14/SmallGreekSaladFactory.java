package lab14;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab14
 * Date: 5/21/2018
 */
public class SmallGreekSaladFactory extends GreekSaladFactory{
    @Override
    protected Lettuce getLettuce() {
        return new IcebergLettuce();
    }

    @Override
    protected Cucumber getCucumber() {
        return new SmallSiceCucumber();
    }

    @Override
    protected Tomato getTomato() {
        return new CherryTomato();
    }
}
