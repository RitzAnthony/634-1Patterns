package lab12;

import java.util.ArrayList;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab12
 * Date: 5/20/2018
 */
public class FrenchTax implements Taxable {


    @Override
    public int calculateTax(int price) {

        return (int) (price * 0.19);
    }


}
