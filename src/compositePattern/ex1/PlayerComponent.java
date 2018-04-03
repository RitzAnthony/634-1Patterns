package compositePattern.ex1;

import java.util.LinkedList;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: compositePattern
 * Date: 3/29/2018
 */
public abstract class PlayerComponent {
    protected String name;
    protected LinkedList<PlayerComponent> players = new LinkedList<>();

    public PlayerComponent(String name) {
        this.name = name;
    }

    public void addComponent (PlayerComponent playerComponent) {
        players.add(playerComponent);
    }
    public abstract void shoot();

    public abstract void cry() ;

    public abstract void simulateInjury();


}
