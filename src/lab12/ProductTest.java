package lab12;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab12
 * Date: 5/21/2018
 */
public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product(new FrenchTax());
        product.addObserver(new FrenchBorderControl());

        product = new AttributeA(product);
        product = new AttributeA(product);
        product = new AttributeC(product);

        System.out.println(product.getPriceWithTax());
        System.out.println(product.getPrice());
    }
}
