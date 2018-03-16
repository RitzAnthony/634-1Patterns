package factoryMethod.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: factoryMethod.abstractFactory.ex2
 * Date: 3/9/2018
 */
public abstract class House implements WallFactory {
    protected Wall southWall;
    protected Wall eastWall;
    protected Wall northWall;
    protected Wall westWall;

    public House() {
       buildHouse();
    }

    public void buildHouse() {
        southWall = createWall();
        eastWall = createWall();
        northWall = createWall();
        westWall = createWall();
    }

    @Override
    public abstract Wall createWall();



    @Override
    public String toString() {
        return "House{" +
                "wallMaterial='" + southWall.getMaterial() + '\'' +
                ", price=" + southWall.getPrice() * 4 +
                '}';
    }

    public void calculatePrice() {
        System.out.println("Price: " + southWall.getPrice() * 4);
    }
}
