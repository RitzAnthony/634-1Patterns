package strategyPattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: strategyPattern.ex1
 * Date: 3/1/2018
 */
public class ArrowAndBowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting an arrow with a bow");
    }
}
