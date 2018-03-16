package factoryMethod.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: factoryMethod.abstractFactory.ex2
 * Date: 3/16/2018
 */
public class Wall {
    private String material;
    private int price;

    public Wall(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }
}
