package compositePattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: compositePattern
 * Date: 3/29/2018
 */
public class Player extends PlayerComponent {

    public Player(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println(name + " shoots.");
    }

    @Override
    public void cry() {
        System.out.println(name + " cries.");
    }

    @Override
    public void simulateInjury() {
        System.out.println(name + " simulates injury.");
    }
}
