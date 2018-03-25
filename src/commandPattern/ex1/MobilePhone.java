package commandPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: commandPattern
 * Date: 3/24/2018
 */
public class MobilePhone {

    public static void main(String[] args) {
        Game game = new Game();
// TODO SETUP
        game.pushKey(2);
        game.pushKey(2);
        game.pushKey(3);
        game.pushKey(2);
        game.pushKey(0);
        game.pushKey(1);
        System.out.println("Undo method");
        game.undo();
    }
}
