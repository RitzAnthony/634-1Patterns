package lab12;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab12
 * Date: 5/20/2018
 */
public class AttributeC extends ProductDecorator{

    public AttributeC(Product product) {
        super(product, 130);
    }

    @Override
    public int getPrice() {
        return product.getPrice() + price;
    }
}
