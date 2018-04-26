package statePattern.ex1;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: statePattern.ex1
 * Date: 4/14/2018
 */
public interface CoffeeState {
    void serviceNeeded();
    void idle();
    void insertingCoins();
    void makeCoffee();
    void userChoose();
}
