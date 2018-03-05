package strategyPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: strategyPattern.ex1
 * Date: 3/1/2018
 */
public class TestExercise1 {

    public static void main (String [] args) {
        Character [] characters = {
                new King(new KnifeBehavior()),
                new Troll(new AxeBehavior()),
                new Queen(new ArrowAndBowBehavior()),
                new Knight(new SwordBehavior())
        };

        for (Character character: characters) {
            character.fight();
        }

    }
}
