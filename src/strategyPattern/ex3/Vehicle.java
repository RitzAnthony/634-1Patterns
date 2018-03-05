package strategyPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: strategyPattern.ex3
 * Date: 3/2/2018
 */
public class Vehicle implements Acceleratable, Stoppable {
    private Acceleratable engine;
    private Stoppable brake;

    public Vehicle(Acceleratable engine, Stoppable brake) {
        this.engine = engine;
        this.brake = brake;
    }

    @Override
    public void accelerate() {
        engine.accelerate();
    }

    @Override
    public void brake() {
        brake.brake();
    }
}
