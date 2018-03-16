package abstractFactory.ex1;

import abstractFactory.ex1.house.House;
import abstractFactory.ex1.house.HouseFactory;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public class abstractFactoryTest {

    public static void main(String[] args) {
        HouseFactory houseFactory1 = new WoodHouseFactory();
        House house1 = houseFactory1.buildHouse();
        System.out.println(house1);

        HouseFactory houseFactory2 = new BricksHouseFactory();
        House house2 = houseFactory2.buildHouse();
        System.out.println(house2);

        HouseFactory houseFactory3 = new GlassHouseFactory();
        House house3 = houseFactory3.buildHouse();
        System.out.println(house3);
    }
}
