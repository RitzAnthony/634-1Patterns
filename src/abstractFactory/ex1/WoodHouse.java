package abstractFactory.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public class WoodHouse extends House {
    public WoodHouse(Wall southWall, Wall eastWall, Wall northWall, Wall westWall) {
        super(southWall, eastWall, northWall, westWall);
    }
}
