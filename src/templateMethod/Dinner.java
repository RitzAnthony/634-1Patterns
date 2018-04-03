package templateMethod;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: templateMethod
 * Date: 4/3/2018
 */
public abstract class Dinner {

    public final void prepare() {
        serveWater();
        prepareVegetables();
        prepareMainMenu();
        prepareCheese();
        prepareDesert();
        cleanTable();
    }

    public final void serveWater() {
        System.out.println("Serve water");
    }

    public abstract void prepareVegetables();

    public abstract void prepareMainMenu();

    public abstract void prepareCheese();

    public abstract void prepareDesert();

    public final void cleanTable() {
        System.out.println("Clean table");
    }

}
