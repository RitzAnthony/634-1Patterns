package templateMethod;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: templateMethod
 * Date: 4/3/2018
 */
public class SteakDinner extends Dinner {
    @Override
    public void prepareVegetables() {
        System.out.println("Prepare vegetables");
    }

    @Override
    public void prepareMainMenu() {
        System.out.println("Prepare steak");
    }

    @Override
    public void prepareCheese() {
        System.out.println("Prepare cheese");
    }

    @Override
    public void prepareDesert() {
        System.out.println("Prepare desert");
    }
}
