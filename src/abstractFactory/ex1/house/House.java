package abstractFactory.ex1.house;

import abstractFactory.ex1.door.Door;
import abstractFactory.ex1.wall.Wall;
import abstractFactory.ex1.window.Window;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public abstract class House {

    private String name;

    private Wall southWall;
    private Wall eastWall;
    private Wall northWall;
    private Wall westWall;

    private Door door;
    private Window window;

    public House(String name) {
        this.name = name;
    }

    //Setters
    public void setSouthWall(Wall southWall) {
        this.southWall = southWall;
    }

    public void setEastWall(Wall eastWall) {
        this.eastWall = eastWall;
    }

    public void setNorthWall(Wall northWall) {
        this.northWall = northWall;
    }

    public void setWestWall(Wall westWall) {
        this.westWall = westWall;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    //Getters
    public String getName() {
        return name;
    }

    public Wall getSouthWall() {
        return southWall;
    }

    public Wall getEastWall() {
        return eastWall;
    }

    public Wall getNorthWall() {
        return northWall;
    }

    public Wall getWestWall() {
        return westWall;
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", southWall=" + southWall.getMaterial() +
                ", eastWall=" + eastWall.getMaterial() +
                ", northWall=" + northWall.getMaterial() +
                ", westWall=" + westWall.getMaterial() +
                ", door=" + door.getName() +
                ", window=" + window.getName() +
                '}';
    }

}
