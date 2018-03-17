package abstractFactory.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex2
 * Date: 3/17/2018
 */
public class CoupeFactory extends AbstractCarFactory {
    @Override
    protected Car createCar() {
        return new Coupe();
    }

    @Override
    public Engine createEngine() {
        return new GasolineEngine();
    }
}
