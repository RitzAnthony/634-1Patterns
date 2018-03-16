package factoryMethod.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: factoryMethod.abstractFactory.ex2
 * Date: 3/9/2018
 */
public class GlassHouse extends House {
    @Override
    public Wall createWall() {
        return new Wall("Glass", 25000);
    }
}
