package abstractFactory.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public abstract class HouseFactory {
    protected WallFactory wallFactory;

    public HouseFactory(WallFactory wallFactory) {
        this.wallFactory = wallFactory;
    }

    public abstract House createHouse (String house);
}
