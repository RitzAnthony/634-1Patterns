package abstractFactory.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public abstract class Wall {
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
