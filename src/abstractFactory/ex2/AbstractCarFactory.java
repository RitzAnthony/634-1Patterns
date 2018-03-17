package abstractFactory.ex2;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: abstractFactory.ex1.abstractFactory.ex2
 * Date: 3/16/2018
 */
public abstract class AbstractCarFactory implements EngineFactory {
    public Car buildCar (){
        Car result = createCar();
        result.setEngine(createEngine());

        return  result;
    }

    protected abstract Car createCar();

    @Override
    public abstract Engine createEngine();

}
