package abstractFactory.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public class ConcreteWallFactory implements WallFactory {

    @Override
    public Wall createWall(String house) {
        if (house.equals("WoodHouse")) return new WoodWall();
        if (house.equals("BricksHouse")) return new BrickWall();
        return new GlassWall();
    }
}
