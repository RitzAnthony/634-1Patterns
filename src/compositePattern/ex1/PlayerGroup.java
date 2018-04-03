package compositePattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: compositePattern
 * Date: 3/29/2018
 */
public class PlayerGroup extends PlayerComponent {

    public PlayerGroup(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        players.forEach(PlayerComponent::shoot);
    }

    @Override
    public void cry() {
        players.forEach(PlayerComponent::cry);
    }

    @Override
    public void simulateInjury() {
        players.forEach(PlayerComponent::simulateInjury);
    }
}
