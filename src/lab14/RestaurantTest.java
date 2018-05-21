package lab14;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab14
 * Date: 5/21/2018
 */
public class RestaurantTest {
    public static void main(String[] args) {
        ChiefGreekSaladFactory factory = new ChiefGreekSaladFactory();
        GreekSalad salad = factory.getSalad();

        salad = new OliveDecorator(salad);
        salad = new OliveDecorator(salad);
        salad = new PaprikaDecorator(salad);

        System.out.println(salad);
    }
}
