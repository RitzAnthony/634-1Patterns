package lab12;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab12
 * Date: 5/20/2018
 */
public class AttributeA extends ProductDecorator {

    public AttributeA(Product product) {
        super(product, 100);
    }

    @Override
    public int getPrice() {
        return product.getPrice() + price;
    }


}
