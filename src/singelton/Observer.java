package singelton;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: singelton
 * Date: 3/17/2018
 */
public class Observer {
    ObserveableOnboardSystem onboardSystem;
    String name;
    private static int counter = 0;

    public Observer(ObserveableOnboardSystem onboardSystem) {
        this.onboardSystem = onboardSystem;
        name = "Observer" + counter++;
        onboardSystem.addObserver(this);
    }

    public void update(String warning) {
        System.out.println(name + " " + warning);
    }
}
