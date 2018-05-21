package lab12;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab12
 * Date: 5/21/2018
 */
public class FrenchBorderControl implements Observer {


    @Override
    public void update(int price, int tax) {
        System.out.println("French border control: price: " + price + "tax: " + tax);
    }
}
