package abstractFactory.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public class abstractFactoryTest {

    public static void main(String[] args) {
        HouseFactory houseFactory = new ConcreteHouseFactory(new ConcreteWallFactory());

        House house1 = houseFactory.createHouse("BricksHouse");
        System.out.println(house1);

        House house2 = houseFactory.createHouse("WoodHouse");
        System.out.println(house2);

        House house3 = houseFactory.createHouse("GlassHouse");
        System.out.println(house3);
    }
}
