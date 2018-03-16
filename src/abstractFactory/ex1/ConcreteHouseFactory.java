package abstractFactory.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public class ConcreteHouseFactory extends HouseFactory {

    public ConcreteHouseFactory(WallFactory wallFactory) {
        super(wallFactory);
    }

    @Override
    public House createHouse(String house) {
        if (house.equals("WoodHouse"))
            return new WoodHouse(
                    wallFactory.createWall(house),
                    wallFactory.createWall(house),
                    wallFactory.createWall(house),
                    wallFactory.createWall(house)
            );

        if (house.equals("BricksHouse"))
            return new BricksHouse(
                    wallFactory.createWall(house),
                    wallFactory.createWall(house),
                    wallFactory.createWall(house),
                    wallFactory.createWall(house)
            );

        return new GlassHouse(
                wallFactory.createWall(house),
                wallFactory.createWall(house),
                wallFactory.createWall(house),
                wallFactory.createWall(house)
        );
    }
}
