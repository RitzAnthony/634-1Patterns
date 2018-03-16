package abstractFactory.ex1.house;

import abstractFactory.ex1.door.Door;
import abstractFactory.ex1.door.DoorFactory;
import abstractFactory.ex1.wall.Wall;
import abstractFactory.ex1.wall.WallFactory;
import abstractFactory.ex1.window.Window;
import abstractFactory.ex1.window.WindowFactory;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public abstract class HouseFactory implements WallFactory, WindowFactory, DoorFactory{

    public House buildHouse () {
        House result = createHouse();

        result.setEastWall(createWall());
        result.setWestWall(createWall());
        result.setNorthWall(createWall());
        result.setSouthWall(createWall());

        result.setWindow(createWindow());
        result.setDoor(createDoor());

        return result;
    }

    public abstract House createHouse();

    @Override
    public abstract Door createDoor();

    @Override
    public abstract Wall createWall();

    @Override
    public abstract Window createWindow();
}
