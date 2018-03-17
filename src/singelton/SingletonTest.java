package singelton;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: singelton
 * Date: 3/17/2018
 */
public class SingletonTest {
    public static void main(String[] args) {
        //Option1: double checked locking
        ObserveableOnboardSystem system = ObserveableOnboardSystem.getInstance();

        Observer observer1 = new Observer(ObserveableOnboardSystem.getInstance());
        Observer observer2 = new Observer(ObserveableOnboardSystem.getInstance());
        Observer observer3 = new Observer(ObserveableOnboardSystem.getInstance());

        system.setSpeed(300);

        //Option2: Demand holder
        DemandHolder.getInstance();
    }
}
