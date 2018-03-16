package factoryMethod.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: factoryMethod.abstractFactory.ex2
 * Date: 3/9/2018
 */
public class WoodHouse extends House {
    @Override
    public Wall createWall() {
        return new Wall("Wood", 10000);
    }
}
