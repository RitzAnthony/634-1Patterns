package lab12;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab12
 * Date: 5/20/2018
 */
public abstract class ProductDecorator extends Product {
    protected Product product;
    protected int price;

    public ProductDecorator(Product product, int price) {
        super(product.tax);
        this.product = product;
        this.price = price;
    }

    @Override
    public abstract int getPrice();

    @Override
    public int getPriceWithTax() {
        product.notifyObservers();
        return product.tax.calculateTax(product.getPrice() + price);
    }

    @Override
    public void addObserver(Observer observer) {
        product.addObserver(observer);
    }

    @Override
    public void notifyObservers() {
        product.notifyObservers();
    }
}
