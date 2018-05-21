package lab12;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab12
 * Date: 5/20/2018
 */
public class AttributeB extends ProductDecorator{

    public AttributeB(Product product) {
        super(product, 120);
    }

    @Override
    public int getPrice() {
        return product.getPrice() + price;
    }
}
