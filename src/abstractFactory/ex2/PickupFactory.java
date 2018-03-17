package abstractFactory.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1.abstractFactory.ex2
 * Date: 3/16/2018
 */
public class PickupFactory extends AbstractCarFactory {


    @Override
    protected Car createCar() {
        return new Pickup();
    }

    @Override
    public Engine createEngine() {
        return new DieselEngine();
    }
}
