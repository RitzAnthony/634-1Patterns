package factoryMethod.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: factoryMethod.abstractFactory.ex2
 * Date: 3/9/2018
 */
public class WallFactoryTest {
    public static void main(String[] args) {

        House house1 = new GlassHouse();
        house1.buildHouse();
        house1.calculatePrice();

        House house2 = new BricksHouse();
        house2.buildHouse();
        house2.calculatePrice();

        House house3 = new WoodHouse();
        house3.buildHouse();
        house3.calculatePrice();
    }
}
