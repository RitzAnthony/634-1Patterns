package lab12;

import java.util.ArrayList;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: lab12
 * Date: 5/17/2018
 */
public class Product implements Observable{
    private int price = 0;
    protected Taxable tax;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Product(Taxable taxable) {
        this.tax = taxable;
    }

    public int getPrice() {
        return price;
    }

    public int getPriceWithTax() {
        notifyObservers();
        return price + tax.calculateTax(price);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(getPrice(), tax.calculateTax(price)));
    }
}
