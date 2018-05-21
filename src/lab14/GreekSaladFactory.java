package lab14;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab14
 * Date: 5/21/2018
 */
public abstract class GreekSaladFactory {
    public GreekSalad getSalad(){
        GreekSalad result = new GreekSalad();

        result.setLettuce(getLettuce());
        result.setCucumber(getCucumber());
        result.setTomato(getTomato());

        return result;
    }

    protected abstract Lettuce getLettuce();

    protected abstract Cucumber getCucumber();

    protected abstract Tomato getTomato();
}
