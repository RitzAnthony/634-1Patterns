package abstractFactory.ex1;

import abstractFactory.ex1.door.Door;
import abstractFactory.ex1.door.LargeDoor;
import abstractFactory.ex1.house.GlassHouse;
import abstractFactory.ex1.house.House;
import abstractFactory.ex1.house.HouseFactory;
import abstractFactory.ex1.wall.GlassWall;
import abstractFactory.ex1.wall.Wall;
import abstractFactory.ex1.window.BigWindow;
import abstractFactory.ex1.window.Window;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public class GlassHouseFactory extends HouseFactory {
    @Override
    public House createHouse() {
        return new GlassHouse();
    }

    @Override
    public Door createDoor() {
        return new LargeDoor();
    }

    @Override
    public Wall createWall() {
        return new GlassWall();
    }

    @Override
    public Window createWindow() {
        return new BigWindow();
    }
}
