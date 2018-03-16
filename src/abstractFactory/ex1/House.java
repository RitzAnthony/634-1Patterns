package abstractFactory.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1
 * Date: 3/16/2018
 */
public abstract class House {
    private Wall southWall;
    private Wall eastWall;
    private Wall northWall;
    private Wall westWall;

    public House(Wall southWall, Wall eastWall, Wall northWall, Wall westWall) {
        this.southWall = southWall;
        this.eastWall = eastWall;
        this.northWall = northWall;
        this.westWall = westWall;
    }

    @Override
    public String toString() {
        return "House{" +
                "southWall=" + southWall +
                ", eastWall=" + eastWall +
                ", northWall=" + northWall +
                ", westWall=" + westWall +
                '}' + ", Price = " + southWall.getPrice() * 4;
    }
}
