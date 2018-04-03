package compositePattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: compositePattern
 * Date: 3/29/2018
 */
public class PlayerComponentTest {
    public static void main(String[] args) {
        Player king = new Player("King");
        Player queen = new Player("Queen");
        Player knight = new Player("Knight");

        PlayerGroup group = new PlayerGroup("Playergroup");
        group.addComponent(king);
        group.addComponent(queen);
        group.addComponent(knight);

        group.cry();
        group.shoot();
        group.shoot();
    }
}
