package lab12;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab12
 * Date: 5/20/2018
 */
public class SwissTax implements Taxable {
    @Override
    public int calculateTax(int price) {
        return (int) (price * 0.08);
    }
}
