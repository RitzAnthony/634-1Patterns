package strategyPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: testPackage
 * Date: 3/2/2018
 */
public class DrumBrake implements Stoppable {
    @Override
    public void brake() {
        System.out.println("Drum brake brakes");
    }
}
