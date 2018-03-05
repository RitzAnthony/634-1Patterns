package strategyPattern.ex3;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: testPackage
 * Date: 3/2/2018
 */
public class GasolineEngine implements Acceleratable{

    @Override
    public void accelerate() {
        System.out.println("Gasoline engine accelerates");
    }
}
